package com.okinc.tradingbot.impl.mln.ud;

import android.content.Context;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.immomo.mls.fun.ud.view.UDView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60044zuT;
import o.wLF;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC60044zuT
public final class MlnBotKLineTopView extends UDView<View> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final String[] AEQbTJ = new String[0];

    @InterfaceC60044zuT
    public MlnBotKLineTopView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.mln.ud.MlnBotKLineTopView.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String[] KWHzl() {
            return MlnBotKLineTopView.AEQbTJ;
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public View AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        String str = javaString == null ? "" : javaString;
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        String javaString2 = luaValue2 != null ? luaValue2.toJavaString() : null;
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        String javaString3 = luaValue3 != null ? luaValue3.toJavaString() : null;
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(contextAubY);
        fragmentContainerView.setId(View.generateViewId());
        if (ViewCompat.isAttachedToWindow(fragmentContainerView)) {
            Context context = fragmentContainerView.getContext();
            Intrinsics.copydefault(context, "");
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            fragmentTransactionBeginTransaction.replace(fragmentContainerView.getId(), wLF.Companion.OLrzqt(str, javaString2, javaString3));
            fragmentTransactionBeginTransaction.commitNow();
        } else {
            fragmentContainerView.addOnAttachStateChangeListener(new Application(fragmentContainerView, fragmentContainerView, str, javaString2, javaString3));
        }
        return fragmentContainerView;
    }

    public static final class Application implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ String EZpvd;
        public final /* synthetic */ String KWHzl;
        public final /* synthetic */ String OLrzqt;
        public final /* synthetic */ FragmentContainerView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public Application(View view, FragmentContainerView fragmentContainerView, String str, String str2, String str3) {
            this.AEQbTJ = view;
            this.copydefault = fragmentContainerView;
            this.KWHzl = str;
            this.OLrzqt = str2;
            this.EZpvd = str3;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ.removeOnAttachStateChangeListener(this);
            Context context = this.copydefault.getContext();
            Intrinsics.copydefault(context, "");
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            fragmentTransactionBeginTransaction.replace(view.getId(), wLF.Companion.OLrzqt(this.KWHzl, this.OLrzqt, this.EZpvd));
            fragmentTransactionBeginTransaction.commitNow();
        }
    }
}
