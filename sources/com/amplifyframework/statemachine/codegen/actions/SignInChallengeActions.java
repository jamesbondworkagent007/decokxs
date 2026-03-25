package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface SignInChallengeActions {
    Action verifyChallengeAuthAction(@NotNull String str, @NotNull Map<String, String> map, @NotNull List<AuthUserAttribute> list, @NotNull AuthChallenge authChallenge);
}
