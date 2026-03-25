package com.okinc.okcomponents.feature.oknotificationcenter.impl.module.di;

import android.content.Context;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.module.di.SystemPushModule;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterActivity;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C42580rYc;
import o.C42596rYs;
import o.C42611rZg;
import o.C42629rZy;
import o.C43251rlk;
import o.C44629saY;
import o.C46938tgc;
import o.C46945tgj;
import o.InterfaceC44628saX;
import o.InterfaceC46951tgp;
import o.InterfaceC47278tmy;
import o.rXO;
import o.rXQ;
import o.rXT;
import o.rXW;
import o.rXX;
import o.rXY;
import o.rYZ;
import o.rZA;
import o.yCR;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class SystemPushModule {
    public static final ActionBar Companion = new ActionBar(null);

    public abstract rXT AEQbTJ(@NotNull C42629rZy c42629rZy);

    public abstract rXQ KWHzl(@NotNull rZA rza);

    public abstract rXX KWHzl(@NotNull C42580rYc c42580rYc);

    public abstract rYZ KWHzl(@NotNull C42611rZg c42611rZg);

    public abstract InterfaceC44628saX KWHzl(@NotNull C44629saY c44629saY);

    public abstract rXY OLrzqt(@NotNull rXW rxw);

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.impl.module.di.SystemPushModule.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        @yCR
        public final InterfaceC46951tgp copydefault() {
            return C46945tgj.AEQbTJ.djBIcL();
        }

        @yCR
        public final C46938tgc AEQbTJ() {
            return C46938tgc.copydefault;
        }

        @yCR
        public final C42629rZy EZpvd(@NotNull C42596rYs c42596rYs, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
            Intrinsics.checkNotNullParameter(c42596rYs, "");
            Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
            return new C42629rZy(new yHO() { // from class: o.rZv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return SystemPushModule.ActionBar.KWHzl((android.content.Context) obj, ((java.lang.Integer) obj2).intValue(), (java.lang.String) obj3);
                }
            }, c42596rYs, interfaceC47278tmy);
        }

        public static final Unit KWHzl(Context context, int i, String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            context.startActivity(NotificationCenterActivity.Companion.AEQbTJ(context, "EXTRA_KEY_FROM_COPY_TRADING", null, str));
            return Unit.INSTANCE;
        }

        @yCR
        public final rXO KWHzl() {
            return (rXO) C43251rlk.OLrzqt(rXO.class);
        }
    }
}
