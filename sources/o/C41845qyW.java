package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.ViewKt;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.CountDownType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qyW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41845qyW extends AbstractC39964qEh<C39994qFk, C42805rdO> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42805rdO AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42805rdO c42805rdOOLrzqt = C42805rdO.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42805rdOOLrzqt, "");
        return c42805rdOOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    public void AEQbTJ(@NotNull final C42805rdO c42805rdO, final int i, @NotNull final C39994qFk c39994qFk) {
        Intrinsics.checkNotNullParameter(c42805rdO, "");
        Intrinsics.checkNotNullParameter(c39994qFk, "");
        AppCompatTextView appCompatTextView = c42805rdO.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        AEQbTJ(appCompatTextView, c39994qFk.EZpvd());
        C41431qqg.AEQbTJ(c42805rdO.gEmmrt, C33129mqd.OLrzqt(c39994qFk.AhwBna()), (Function1<? super android.widget.TextView, Unit>) new Function1() { // from class: o.qyV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41845qyW.KWHzl(this.copydefault, c39994qFk, (android.widget.TextView) obj);
            }
        });
        C41431qqg.AEQbTJ(c42805rdO.AhwBna, c39994qFk.fIwbmz(), (Function1<? super android.widget.TextView, Unit>) new Function1() { // from class: o.qyX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41845qyW.OLrzqt(c39994qFk, (android.widget.TextView) obj);
            }
        });
        android.widget.TextView textView = c42805rdO.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        int i2 = 0;
        textView.setVisibility(c39994qFk.fJNWhG() ? 0 : 8);
        android.widget.TextView textView2 = c42805rdO.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        if (!c39994qFk.KWHzl().isRebasePair() && !c39994qFk.KWHzl().isPreMarketPair()) {
            i2 = 8;
        }
        textView2.setVisibility(i2);
        if (c39994qFk.KWHzl().isRebasePair()) {
            c42805rdO.valueOf.setText(C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPRGtXKCDKRTZD));
        } else if (c39994qFk.KWHzl().isPreMarketPair()) {
            c42805rdO.valueOf.setText(C33070mpX.AYXKKw(qZH.PendingIntent.hbZCHz));
        }
        CountDownInfo countDownInfo = c39994qFk.KWHzl().getCountDownInfo();
        if (countDownInfo == null || (countDownInfo.countDownTimeExpire() && countDownInfo.getShowType() != CountDownType.SHOW_EXPECT)) {
            countDownInfo = null;
        }
        C40492qXw c40492qXw = c42805rdO.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c40492qXw, "");
        if (!C41310qoR.AEQbTJ(c40492qXw, countDownInfo, c39994qFk.KWHzl().getInstId(), c39994qFk.KWHzl().getInstType())) {
            C41431qqg.AEQbTJ(c42805rdO.EZpvd, c39994qFk.iwGUEr(), (Function1<? super C42963rgN, Unit>) new Function1() { // from class: o.qyY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C41845qyW.KWHzl(c39994qFk, (C42963rgN) obj);
                }
            });
            C41431qqg.AEQbTJ(c42805rdO.AYXKKw, c39994qFk.hDKMBd(), (Function1<? super android.widget.TextView, Unit>) new Function1() { // from class: o.qyU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C41845qyW.AEQbTJ(c39994qFk, (android.widget.TextView) obj);
                }
            });
        } else {
            C42963rgN c42963rgN = c42805rdO.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c42963rgN, "");
            c42963rgN.setVisibility(8);
            android.widget.TextView textView3 = c42805rdO.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
        }
        AppCompatImageView appCompatImageView = c42805rdO.KWHzl;
        appCompatImageView.setEnabled(!c39994qFk.AubY());
        appCompatImageView.setSelected(c39994qFk.isConnected());
        c42805rdO.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.qzc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C41845qyW.AEQbTJ(c39994qFk, c42805rdO, i, view);
            }
        });
    }

    public static final Unit KWHzl(C41845qyW c41845qyW, C39994qFk c39994qFk, android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        c41845qyW.AEQbTJ(textView, c39994qFk.AhwBna());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C39994qFk c39994qFk, android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setText(c39994qFk.copydefault());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C39994qFk c39994qFk, C42963rgN c42963rgN) {
        Intrinsics.checkNotNullParameter(c42963rgN, "");
        c42963rgN.setText(c39994qFk.AYXKKw());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C39994qFk c39994qFk, android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        C41426qqb.setText$default(textView, c39994qFk.djBIcL(), (java.lang.CharSequence) c39994qFk.gEmmrt(), 0, 0, 0, false, 60, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C39994qFk c39994qFk, C42805rdO c42805rdO, int i, android.view.View view) {
        java.lang.Object objM7377constructorimpl;
        if (c39994qFk.AubY()) {
            return;
        }
        c42805rdO.KWHzl.setSelected(!r5.isSelected());
        C40499qYc root = c42805rdO.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(root));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
        if (fragment != null) {
            boolean z = fragment instanceof InterfaceC41923qzv;
            java.lang.Object obj = fragment;
            if (!z) {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof InterfaceC41923qzv)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                obj = (InterfaceC41923qzv) (parentFragment instanceof InterfaceC41923qzv ? parentFragment : null);
            }
            InterfaceC41923qzv interfaceC41923qzv = (InterfaceC41923qzv) obj;
            if (interfaceC41923qzv != null) {
                interfaceC41923qzv.KWHzl(i, c39994qFk.KWHzl(), c42805rdO.KWHzl.isSelected());
            }
        }
        c39994qFk.AEQbTJ(c42805rdO.KWHzl.isSelected());
    }
}
