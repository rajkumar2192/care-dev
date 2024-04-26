// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package reckitt.azure.cosmos.common;

import org.apache.commons.lang3.StringUtils;

public class AccountSettings {
    // Replace MASTER_KEY and HOST with values from your Azure Cosmos DB account.
    // The default values are credentials of the local emulator, which are not used in any production environment.
    // <!--[SuppressMessage("Microsoft.Security", "CS002:SecretInNextLine")]-->
    public static String MASTER_KEY =
            System.getProperty("ACCOUNT_KEY", 
                    StringUtils.defaultString(StringUtils.trimToNull(
                            System.getenv().get("ACCOUNT_KEY")),
                            "=="));

    public static String HOST =
            System.getProperty("ACCOUNT_HOST",
                    StringUtils.defaultString(StringUtils.trimToNull(
                            System.getenv().get("ACCOUNT_HOST")),
                            "https://ca:443/"));
}
