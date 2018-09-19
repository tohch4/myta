# MyTA

This is a proof of concept tool to programmatically gather, collate. and
analyze TrustedAdvisor output for 1 or more AWS accounts. Filtering or template
logic can be applied to analyze or react to only the desired subset.

# Quickstart

Use traditional AWS_PROFILE environment variable and give it a whirl.

```
export AWS_PROFILE=My_AWS_Profile_Name # Check ~/.aws/credentials if unsure
mvn exec:java -Dexec.mainClass="gov.cms.qpp.fc.myta.App"
```

# Prerequisites

## Development

- Java 8 JDK
- mvn 3.5.4
- 1 or more AWS account API keys

# Installation

# Configuration

# Deployment