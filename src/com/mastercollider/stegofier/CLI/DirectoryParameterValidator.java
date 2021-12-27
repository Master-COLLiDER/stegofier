/*******************************************************************************
 * This file is made by Probal D. Saikia 27/12/2021.
 * https://github.com/Master-COLLiDER
 * NOTICE: This file is subject to the terms and conditions defined
 * in the file 'LICENSE' which is part of this source code package.
 ******************************************************************************/

package com.mastercollider.stegofier.CLI;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryParameterValidator implements IParameterValidator {

    @Override
    public void validate(String name, String value) throws ParameterException {
        Path pathToConfigDir = Paths.get(value);
        if (!exists(pathToConfigDir)) {
            String message = String.format("The [%s] directory [%s] does not exist: ", name, value);
            throw new ParameterException(message);
//            File file = new File(value);
////          Creating the directory
//            file.mkdir();
        }
        if (!Files.isDirectory(pathToConfigDir, LinkOption.NOFOLLOW_LINKS)) {
            String message = String.format("The [%s] directory specified [%s] is not a directory: ", name, value);
            throw new ParameterException(message);
        }
        if (!checkPermissions(pathToConfigDir)) {
            String message = String.format("Application does not have read & write permissions to [%s] directory [%s]", name, value);
            throw new ParameterException(message);
        }

    }

    private boolean checkPermissions(Path path) {
        return (Files.isReadable(path) && Files.isWritable(path));
    }

    private boolean exists(Path path) {
        return (Files.exists(path, LinkOption.NOFOLLOW_LINKS));
    }

}
