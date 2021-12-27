/*******************************************************************************
 * This file is made by Probal D. Saikia 27/12/2021.
 * https://github.com/Master-COLLiDER
 * NOTICE: This file is subject to the terms and conditions defined
 * in the file 'LICENSE' which is part of this source code package.
 ******************************************************************************/

package com.mastercollider.stegofier.ImageProcessing.pixel;

import com.mastercollider.stegofier.Color.ColorChannel;
import org.jetbrains.annotations.NotNull;

public class PixelLSBExtraction {

    public static int doExtract(@NotNull Pixel input, @NotNull ColorChannel channel , int bitPosition)
    {
        if(channel.toString().length() != 1 )
            throw new RuntimeException("Invalid ColorChannel "+channel+"for method doExtract()");

        int b;
        b = input.getColorValue(channel);
        b = (b >> bitPosition)& 1;

        return b;
    }
}
