package com.amplifyframework.statemachine.codegen.data;

import android.app.Activity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HostedUIOptions {
    private final String browserPackage;
    private final Activity callingActivity;
    private final HostedUIProviderInfo providerInfo;
    private final List<String> scopes;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.data.HostedUIOptions */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HostedUIOptions copy$default(HostedUIOptions hostedUIOptions, Activity activity, List list, HostedUIProviderInfo hostedUIProviderInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            activity = hostedUIOptions.callingActivity;
        }
        if ((i & 2) != 0) {
            list = hostedUIOptions.scopes;
        }
        if ((i & 4) != 0) {
            hostedUIProviderInfo = hostedUIOptions.providerInfo;
        }
        if ((i & 8) != 0) {
            str = hostedUIOptions.browserPackage;
        }
        return hostedUIOptions.copy(activity, list, hostedUIProviderInfo, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Activity component1() {
        return this.callingActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.scopes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HostedUIProviderInfo component3() {
        return this.providerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.browserPackage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HostedUIOptions copy(@NotNull Activity activity, List<String> list, @NotNull HostedUIProviderInfo hostedUIProviderInfo, String str) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(hostedUIProviderInfo, "");
        return new HostedUIOptions(activity, list, hostedUIProviderInfo, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostedUIOptions)) {
            return false;
        }
        HostedUIOptions hostedUIOptions = (HostedUIOptions) obj;
        return Intrinsics.EZpvd(this.callingActivity, hostedUIOptions.callingActivity) && Intrinsics.EZpvd(this.scopes, hostedUIOptions.scopes) && Intrinsics.EZpvd(this.providerInfo, hostedUIOptions.providerInfo) && Intrinsics.EZpvd((Object) this.browserPackage, (Object) hostedUIOptions.browserPackage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrowserPackage() {
        return this.browserPackage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Activity getCallingActivity() {
        return this.callingActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HostedUIProviderInfo getProviderInfo() {
        return this.providerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getScopes() {
        return this.scopes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.callingActivity.hashCode();
        List<String> list = this.scopes;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        int iHashCode3 = this.providerInfo.hashCode();
        String str = this.browserPackage;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HostedUIOptions(callingActivity=" + this.callingActivity + ", scopes=" + this.scopes + ", providerInfo=" + this.providerInfo + ", browserPackage=" + this.browserPackage + ")";
    }

    public HostedUIOptions(@NotNull Activity activity, List<String> list, @NotNull HostedUIProviderInfo hostedUIProviderInfo, String str) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(hostedUIProviderInfo, "");
        this.callingActivity = activity;
        this.scopes = list;
        this.providerInfo = hostedUIProviderInfo;
        this.browserPackage = str;
    }
}
