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
public class MainCLIParameters {


    @Parameter(names = {"-h", "--help"},
            help = true, //if not then will get
            description = "Displays help information")
    private boolean help;

    public boolean isHelp(){return help;}
}
