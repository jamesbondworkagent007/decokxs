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
import o.C52902wbQ;
import o.InterfaceC60044zuT;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC60044zuT
public final class SmartArbRecommendationView extends UDView<View> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final String[] KWHzl = new String[0];

    @InterfaceC60044zuT
    public SmartArbRecommendationView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.mln.ud.SmartArbRecommendationView.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String[] KWHzl() {
            return SmartArbRecommendationView.KWHzl;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public FragmentContainerView AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
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
            fragmentTransactionBeginTransaction.replace(fragmentContainerView.getId(), new C52902wbQ());
            fragmentTransactionBeginTransaction.commitNow();
        } else {
            fragmentContainerView.addOnAttachStateChangeListener(new ActionBar(fragmentContainerView, fragmentContainerView));
        }
        return fragmentContainerView;
    }

    public static final class ActionBar implements View.OnAttachStateChangeListener {
        public final /* synthetic */ FragmentContainerView EZpvd;
        public final /* synthetic */ View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public ActionBar(View view, FragmentContainerView fragmentContainerView) {
            this.KWHzl = view;
            this.EZpvd = fragmentContainerView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.removeOnAttachStateChangeListener(this);
            Context context = this.EZpvd.getContext();
            Intrinsics.copydefault(context, "");
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            fragmentTransactionBeginTransaction.replace(view.getId(), new C52902wbQ());
            fragmentTransactionBeginTransaction.commitNow();
        }
    }
}
