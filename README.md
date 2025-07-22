# SU Craftable Name Tag

A Minecraft Fabric mod that adds the ability to craft name tags using a crafting table.

## Description

This mod makes name tags craftable by adding a new shaped crafting recipe. Players can now craft name tags using common materials instead of relying solely on finding them in loot chests.

## Features

- **Craftable Name Tags**: Create name tags using string, paper, and iron ingots
- **Crafting Table Recipe**: Uses the standard crafting table interface
- **Balanced Recipe**: Requires multiple materials to maintain game balance
- **Compatible**: Works with Minecraft 1.21.6 and Fabric

## Recipe

To craft a name tag, you need:
- **1 String** (S)
- **2 Iron Ingot** (I)

**Crafting Pattern:**
|   |   | S |
|   | I |   |
| I |   |   |

The recipe is crafted in a **Crafting Table**.

## Installation

### Prerequisites
- Minecraft 1.21.6
- Fabric Loader 0.16.14 or higher
- Fabric API
- Java 21 or higher

### Steps
1. Download the mod JAR file
2. Place it in your `mods` folder
3. Start Minecraft with Fabric

## Development

### Building from Source

1. Clone this repository
2. Run `./gradlew build` (Linux/Mac) or `gradlew.bat build` (Windows)
3. The built JAR will be in `build/libs/`

### Development Environment

This mod is built using:
- **Gradle**: Build system
- **Fabric**: Mod loader
- **Java 21**: Programming language
- **Fabric API**: Required dependency

## Mod Information

- **Mod ID**: `su-craftable-name-tag`
- **Namespace**: `org.survivorsunited.mods.craftablenametag`
- **Version**: 1.0.0
- **Author**: wildone
- **License**: Apache-2.0

## Dependencies

- **Minecraft**: 1.21.6
- **Fabric Loader**: 0.16.14+
- **Fabric API**: Required
- **Java**: 21+

## Recipe Details

The recipe uses a 3x3 crafting grid with the following pattern:
- Top row: ` SS` (2 string, 1 empty)
- Middle row: `PIS` (1 paper, 1 iron ingot, 1 string)
- Bottom row: `IP ` (1 iron ingot, 1 paper, 1 empty)

This creates a balanced recipe that requires:
- 3 String (for the tag's attachment mechanism)
- 1 Paper (for the tag's label material)
- 2 Iron Ingot (for durability and structure)

## Contributing

Contributions are welcome! Please feel free to submit pull requests or open issues for bugs and feature requests.

## License

This mod is licensed under the Apache-2.0 License. See the LICENSE file for details.

## Support

If you encounter any issues or have questions, please open an issue on the project repository.

---

**Note**: This mod is designed to work with Fabric and Minecraft 1.21.6. Compatibility with other versions or mod loaders is not guaranteed. 
