package io.github.railroad.project.data;

import io.github.railroad.minecraft.ForgeVersion;
import io.github.railroad.minecraft.MinecraftVersion;
import io.github.railroad.minecraft.mapping.MappingChannel;
import io.github.railroad.minecraft.mapping.MappingVersion;
import io.github.railroad.project.License;

import java.util.Optional;

public record ForgeProjectData(String projectName, String projectPath, boolean createGit, License license, String licenseCustom,
                               MinecraftVersion minecraftVersion, ForgeVersion forgeVersion, String modId, String modName,
                               String mainClass, boolean useMixins, boolean useAccessTransformer,
                               MappingChannel mappingChannel, MappingVersion mappingVersion,
                               Optional<String> author, Optional<String> description,
                               Optional<String> issues, Optional<String> updateJsonUrl,
                               String groupId, String artifactId, String version) {
}