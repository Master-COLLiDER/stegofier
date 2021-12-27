/*******************************************************************************
 * This file is made by Probal D. Saikia 27/12/2021.
 * https://github.com/Master-COLLiDER
 * NOTICE: This file is subject to the terms and conditions defined
 * in the file 'LICENSE' which is part of this source code package.
 ******************************************************************************/

package com.mastercollider.stegofier.CLI;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(separators = "=") //space works too
public class RSAKeyGeneratorCLIParameters {


    @Parameter(names = {"-h", "--help"},
            help = true, //if not then will get
            description = "Displays help information")
    private boolean help;

    @Parameter(names = {"-d", "--destination_directory"},
            required = true,
          //  validateWith = DirectoryParameterValidator.class,
            description = "Absolute path to directory which will store the generated Keys")
    public String destinationDir;

    public boolean isHelp() {
        return help;
    }

    @Override
    public String toString() {
        return "RSAKeyGeneratorCLIParameters{" +
                "\n help=" + help +
                ",\n destinationDir='" + destinationDir + '\'' +
                "\n }";
    }
}
