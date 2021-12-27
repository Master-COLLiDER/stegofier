# Stegofier

Stegofier is a java console application to encode and decode information to and from an image of type PNG.




# Usage: stegofier [options] [command] [command options]
  
  ## Commands:
   ### encode
      Usage: encode [options]
        Options:
          -cc, --color-channel, 
            Color Channels  (1 - 7) - R: 1, G: 2, B :3, RG: 4, GB: 5, RB: 6, 
            RGB: 7
            Default: 1
        * -c, --cover
            Absolute path to the Cover Image which will store data (Must be 
            PNG or BMP).
          -ET, --encryption-type
            Encryption type (1 - 3): 1 - AES256, 2 - TripleDES, 3 - RSA
            Default: 0
          -h, --help
            Displays help information
          -m, --message
            Message to be stored
          -lsb, --no-of-lsb
            Number of least significant bits: ranges 0 - 7
            Default: 0
          -o, --output
            File name for the output Image.
          -p, --password
            Password for encryption
          -pbk, --public-key
            File name for the public key (Required during encryption if -ET=3 
            (RSA) is selected)

   ### decode
      Usage: decode [options]
        Options:
        * -c, --cover
            Absolute path to the Cover Image which stores the information 
            (Must be PNG or BMP).
          -h, --help
            Displays help information
          -o, --output
            File name for the output extracted data
          -p, --password
            Password for decryption
          -pvtk, --private-key
            File name for the private key (Required during decryption if -ET = 
            3 (RSA) was used as encryption algorithm)

   ### generate
      Usage: generate [options]
        Options:
        * -d, --destination_directory
            Absolute path to directory which will store the generated Keys
          -h, --help
            Displays help information


## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
This project is subject to the terms and conditions defined in the file '[LICENSE](/LICENSE)' which is part of this source code package.
