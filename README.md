## What is it?
Archetype when creating the sermant project.

## How to use it?
Refer to official website guidance, https://sermant.io/zh/document/developer-guide

## How to deploy first-plugin archetype using github action?
### 1. Modify archetype version

```properties
archetype.groupId=com.huaweicloud.sermant
archetype.artifactId=sermant-template-archetype
archetype.version=2.1.0 # modify this version before deploy
excludePatterns=.github/**,.idea/**,.idea/libraries/*,**/*.iml,README.md
```

### 2. Modify config

Update the configuration files under the config/ directory.

### 3. Create new version branch and push tag

Create new version branch, and push version tag:
```shell
git tag vx.x.x
git push origin vx.x.x
```
> Note: origin is git@github.com:sermant-io/first-plugin.git
