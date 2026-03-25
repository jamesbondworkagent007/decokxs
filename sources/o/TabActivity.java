package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.TabActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class TabActivity {
    public static final Activity copydefault = new Activity(null);
    public final UiModeManager AEQbTJ;
    public final RestoreSession KWHzl;
    public final WallpaperInfo OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.TabActivity$ActionBar) A[MD:(o.TabActivity$ActionBar):void (m)] call: o.TabActivity.<init>(o.TabActivity$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TabActivity(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RestoreSession EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WallpaperInfo OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiModeManager copydefault() {
        return this.AEQbTJ;
    }

    public TabActivity(ActionBar actionBar) {
        this.KWHzl = actionBar.KWHzl();
        this.AEQbTJ = actionBar.copydefault();
        this.OLrzqt = actionBar.AEQbTJ();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TabActivity.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SetUserPoolMfaConfigResponse(");
        sb.append("mfaConfiguration=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("smsMfaConfiguration=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("softwareTokenMfaConfiguration=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        RestoreSession restoreSession = this.KWHzl;
        int iHashCode = restoreSession != null ? restoreSession.hashCode() : 0;
        UiModeManager uiModeManager = this.AEQbTJ;
        int iHashCode2 = uiModeManager != null ? uiModeManager.hashCode() : 0;
        WallpaperInfo wallpaperInfo = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (wallpaperInfo != null ? wallpaperInfo.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TabActivity.class != obj.getClass()) {
            return false;
        }
        TabActivity tabActivity = (TabActivity) obj;
        return Intrinsics.EZpvd(this.KWHzl, tabActivity.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, tabActivity.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, tabActivity.OLrzqt);
    }

    public static /* synthetic */ TabActivity copy$default(TabActivity tabActivity, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.SetUserPoolMfaConfigResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TabActivity.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TabActivity.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(tabActivity);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    public static final class ActionBar {
        public WallpaperInfo EZpvd;
        public UiModeManager OLrzqt;
        public RestoreSession copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WallpaperInfo AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(RestoreSession restoreSession) {
            this.copydefault = restoreSession;
        }

        public final ActionBar EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(UiModeManager uiModeManager) {
            this.OLrzqt = uiModeManager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RestoreSession KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(WallpaperInfo wallpaperInfo) {
            this.EZpvd = wallpaperInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UiModeManager copydefault() {
            return this.OLrzqt;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull TabActivity tabActivity) {
            this();
            Intrinsics.checkNotNullParameter(tabActivity, "");
            this.copydefault = tabActivity.EZpvd();
            this.OLrzqt = tabActivity.copydefault();
            this.EZpvd = tabActivity.OLrzqt();
        }

        public final TabActivity OLrzqt() {
            return new TabActivity(this, null);
        }
    }
}
