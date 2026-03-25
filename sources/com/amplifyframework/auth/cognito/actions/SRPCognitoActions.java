package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.SRPActions;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SRPCognitoActions implements SRPActions {
    public static final SRPCognitoActions INSTANCE = new SRPCognitoActions();
    private static final String KEY_CHALLENGE_NAME = "CHALLENGE_NAME";
    private static final String KEY_DEVICE_KEY = "DEVICE_KEY";
    private static final String KEY_PASSWORD_CLAIM_SECRET_BLOCK = "PASSWORD_CLAIM_SECRET_BLOCK";
    private static final String KEY_PASSWORD_CLAIM_SIGNATURE = "PASSWORD_CLAIM_SIGNATURE";
    private static final String KEY_SALT = "SALT";
    private static final String KEY_SECRET_BLOCK = "SECRET_BLOCK";
    private static final String KEY_SECRET_HASH = "SECRET_HASH";
    private static final String KEY_SRP_A = "SRP_A";
    private static final String KEY_SRP_B = "SRP_B";
    private static final String KEY_TIMESTAMP = "TIMESTAMP";
    private static final String KEY_USERID_FOR_SRP = "USER_ID_FOR_SRP";
    private static final String KEY_USERNAME = "USERNAME";
    private static final String KEY_USER_ID_FOR_SRP = "USER_ID_FOR_SRP";
    private static final String VALUE_SRP_A = "SRP_A";

    private SRPCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SRPActions
    public Action initiateSRPAuthAction(@NotNull SRPEvent.EventType.InitiateSRP initiateSRP) {
        Intrinsics.checkNotNullParameter(initiateSRP, "");
        Action.Companion companion = Action.Companion;
        return new SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1("InitSRPAuth", initiateSRP);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SRPActions
    public Action initiateSRPWithCustomAuthAction(@NotNull SRPEvent.EventType.InitiateSRPWithCustom initiateSRPWithCustom) {
        Intrinsics.checkNotNullParameter(initiateSRPWithCustom, "");
        Action.Companion companion = Action.Companion;
        return new SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1("InitSRPCustomAuth", initiateSRPWithCustom);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SRPActions
    public Action verifyPasswordSRPAction(@NotNull Map<String, String> map, @NotNull Map<String, String> map2, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Action.Companion companion = Action.Companion;
        return new SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1("VerifyPasswordSRP", map, map2, str);
    }
}
