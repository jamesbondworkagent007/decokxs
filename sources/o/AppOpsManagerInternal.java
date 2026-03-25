package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AppOpsManagerInternal;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class AppOpsManagerInternal {
    public static final Application EZpvd = new Application(null);
    public final WallpaperInfo AEQbTJ;
    public final RestoreSession KWHzl;
    public final UiModeManager OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AppOpsManagerInternal$ActionBar) A[MD:(o.AppOpsManagerInternal$ActionBar):void (m)] call: o.AppOpsManagerInternal.<init>(o.AppOpsManagerInternal$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AppOpsManagerInternal(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiModeManager AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RestoreSession OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WallpaperInfo copydefault() {
        return this.AEQbTJ;
    }

    public AppOpsManagerInternal(ActionBar actionBar) {
        this.KWHzl = actionBar.EZpvd();
        this.OLrzqt = actionBar.KWHzl();
        this.AEQbTJ = actionBar.AEQbTJ();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AppOpsManagerInternal.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetUserPoolMfaConfigResponse(");
        sb.append("mfaConfiguration=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("smsMfaConfiguration=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("softwareTokenMfaConfiguration=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        RestoreSession restoreSession = this.KWHzl;
        int iHashCode = restoreSession != null ? restoreSession.hashCode() : 0;
        UiModeManager uiModeManager = this.OLrzqt;
        int iHashCode2 = uiModeManager != null ? uiModeManager.hashCode() : 0;
        WallpaperInfo wallpaperInfo = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (wallpaperInfo != null ? wallpaperInfo.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AppOpsManagerInternal.class != obj.getClass()) {
            return false;
        }
        AppOpsManagerInternal appOpsManagerInternal = (AppOpsManagerInternal) obj;
        return Intrinsics.EZpvd(this.KWHzl, appOpsManagerInternal.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, appOpsManagerInternal.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, appOpsManagerInternal.AEQbTJ);
    }

    public static /* synthetic */ AppOpsManagerInternal copy$default(AppOpsManagerInternal appOpsManagerInternal, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.GetUserPoolMfaConfigResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AppOpsManagerInternal.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AppOpsManagerInternal.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(appOpsManagerInternal);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    public static final class ActionBar {
        public UiModeManager AEQbTJ;
        public RestoreSession KWHzl;
        public WallpaperInfo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WallpaperInfo AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RestoreSession EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UiModeManager KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(WallpaperInfo wallpaperInfo) {
            this.copydefault = wallpaperInfo;
        }

        public final ActionBar OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(RestoreSession restoreSession) {
            this.KWHzl = restoreSession;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(UiModeManager uiModeManager) {
            this.AEQbTJ = uiModeManager;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull AppOpsManagerInternal appOpsManagerInternal) {
            this();
            Intrinsics.checkNotNullParameter(appOpsManagerInternal, "");
            this.KWHzl = appOpsManagerInternal.OLrzqt();
            this.AEQbTJ = appOpsManagerInternal.AEQbTJ();
            this.copydefault = appOpsManagerInternal.copydefault();
        }

        public final AppOpsManagerInternal copydefault() {
            return new AppOpsManagerInternal(this, null);
        }
    }
}
