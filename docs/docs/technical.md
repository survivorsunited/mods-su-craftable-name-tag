---
sidebar_position: 5
---

# Technical Documentation

Technical details and information for developers and advanced users.

## Mod Architecture

### Overview

SU Craftable Name Tag is a simple Fabric mod that adds a single crafting recipe to Minecraft. The mod follows a minimal architecture to ensure maximum compatibility and performance.

### Core Components

- **Main Mod Class**: `SUCraftableNameTag.java` - Handles mod initialization and recipe registration
- **Recipe JSON**: `name_tag.json` - Defines the crafting recipe pattern and ingredients
- **Language Files**: `en_us.json` - Provides localization for the mod

### Dependencies

- **Minecraft**: 1.21.x
- **Fabric Loader**: Required
- **Fabric API**: Not required (mod uses vanilla recipe system)
- **Java**: 21+

## Recipe System

### Recipe Definition

The name tag recipe is defined in JSON format:

```json
{
  "type": "minecraft:crafting_shaped",
  "pattern": [
    "  S",
    " I ",
    "I  "
  ],
  "key": {
    "S": {
      "item": "minecraft:string"
    },
    "I": {
      "item": "minecraft:iron_ingot"
    }
  },
  "result": {
    "item": "minecraft:name_tag",
    "count": 1
  }
}
```

### Recipe Pattern

The recipe uses a 3x3 grid pattern:
- **S** = String (1 total) - positioned in top right
- **I** = Iron Ingot (2 total) - positioned in middle and bottom left

This creates a diagonal pattern with the string in the top-right corner and iron ingots in the middle and bottom-left positions.

## Mod Loading

### Initialization Process

1. **Mod Discovery**: Fabric Loader discovers the mod JAR
2. **Class Loading**: Main mod class is loaded
3. **Initialization**: `onInitialize()` method is called
4. **Recipe Registration**: Recipe is registered with Minecraft's recipe system
5. **Completion**: Mod is ready for use

### Entry Point

```java
public class SUCraftableNameTag implements ModInitializer {
    @Override
    public void onInitialize() {
        // Recipe registration happens automatically via JSON
    }
}
```

## Compatibility

### Server-Side Only

This mod is designed to be server-side only:
- **No client-side code** required
- **Vanilla clients** can connect and use the recipe
- **No network packets** or client-server communication needed

### Mod Compatibility

The mod should be compatible with:
- **Other Fabric mods** that don't modify the recipe system
- **Datapacks** that add custom recipes
- **Resource packs** (no texture changes needed)

### Known Conflicts

Potential conflicts with:
- **Mods that modify name tag behavior**
- **Recipe modification mods** (rare)
- **Custom recipe systems** (very rare)

## Performance

### Impact Analysis

- **Memory**: Minimal (< 1MB additional)
- **CPU**: Negligible (only during recipe lookup)
- **Network**: None (no additional packets)
- **Storage**: Minimal (recipe JSON only)

### Optimization

The mod is optimized for:
- **Fast recipe lookup** using Minecraft's built-in system
- **Minimal memory footprint** with no unnecessary objects
- **Efficient initialization** with no complex setup

## Development

### Building from Source

1. **Clone the repository**:
   ```bash
   git clone https://github.com/survivorsunited/mods-su-craftable-name-tag.git
   cd mods-su-craftable-name-tag
   ```

2. **Build the mod**:
   ```bash
   ./gradlew build
   ```

3. **Find the JAR** in `build/libs/`

### Development Environment

- **IDE**: IntelliJ IDEA or Eclipse recommended
- **Gradle**: 8.12.1 or higher
- **Java**: 21 or higher
- **Minecraft**: 1.21.x development environment

### Testing

To test the mod:
1. **Build the mod** using Gradle
2. **Install on a test server** with Fabric Loader
3. **Verify recipe works** in-game
4. **Test with other mods** for compatibility

## Troubleshooting

### Common Issues

**Recipe not appearing**:
- Check that the JSON file is properly formatted
- Verify the recipe is registered during mod initialization
- Ensure no other mods are conflicting

**Mod not loading**:
- Check Fabric Loader installation
- Verify Java version compatibility
- Review server logs for error messages

**Performance issues**:
- Monitor server performance with and without the mod
- Check for conflicts with other mods
- Verify recipe system isn't being modified elsewhere

### Debug Information

To enable debug logging, add to your server properties:
```
debug=true
```

This will show additional information about recipe registration and mod loading.

## Future Development

### Planned Features

- **Configuration options** for recipe materials
- **Multiple recipe variants** for different material costs
- **Integration with other mods** for enhanced functionality

### Contributing

To contribute to the mod:
1. **Fork the repository**
2. **Create a feature branch**
3. **Make your changes**
4. **Test thoroughly**
5. **Submit a pull request**

### Code Style

Follow these guidelines:
- **Use meaningful variable names**
- **Add comments for complex logic**
- **Follow Java conventions**
- **Keep methods small and focused** 