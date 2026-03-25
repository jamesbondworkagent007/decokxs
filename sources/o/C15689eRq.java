package o;

import android.view.View;
import android.view.ViewGroup;
import com.okinc.business.defi.biz.drivers.bean.SupportCloudType;
import com.okinc.core.util.SPUtils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.eRq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15689eRq {
    public static boolean copydefault;
    public static final C15689eRq KWHzl = new C15689eRq();
    public static final int EZpvd = 8;

    /* JADX INFO: renamed from: o.eRq$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SupportCloudType.values().length];
            try {
                iArr[SupportCloudType.GOOGLE_CLOUD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SupportCloudType.HUAWEI_CLOUD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SupportCloudType.BOTH_CLOUD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return copydefault;
    }

    private C15689eRq() {
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull final Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C10856bwO.copydefault("HomeOnboardDialogHelper", 0, "selectProjectWalletType");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(context.getString(C13754dXa.FragmentManager.ActivityResultRegistryLifecycleContainer));
        viewOnClickListenerC54939xaY.EZpvd(context.getString(C13754dXa.FragmentManager.clearObservers));
        java.lang.String string = context.getString(C13754dXa.FragmentManager.onRestoreInstanceState);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.eRp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C15689eRq.EZpvd(function1, viewOnClickListenerC54939xaY, view);
            }
        });
        java.lang.String string2 = context.getString(C13754dXa.FragmentManager.ActivityResultRegistry2);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC54939xaY.AEQbTJ(string2, new View.OnClickListener() { // from class: o.eRv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C15689eRq.OLrzqt(function1, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(1);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(0);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final java.lang.String copydefault(@NotNull SupportCloudType supportCloudType, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(supportCloudType, "");
        Intrinsics.checkNotNullParameter(context, "");
        int i = Activity.OLrzqt[supportCloudType.ordinal()];
        if (i == 1) {
            return C33069mpW.copydefault(C13754dXa.FragmentManager.warmup, C56423yEv.EZpvd(C56390yDp.OLrzqt("CloudName", C14392dkb.AEQbTJ.KWHzl(context, 1))));
        }
        if (i == 2) {
            return C33069mpW.copydefault(C13754dXa.FragmentManager.warmup, C56423yEv.EZpvd(C56390yDp.OLrzqt("CloudName", C14392dkb.AEQbTJ.KWHzl(context, 2))));
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        java.lang.String string = context.getString(C13754dXa.FragmentManager.onCreatePanelMenu);
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }

    public final void KWHzl(@NotNull android.widget.TextView textView, C57440yiU c57440yiU) {
        Intrinsics.checkNotNullParameter(textView, "");
        android.content.Context context = textView.getContext();
        java.util.List<C10854bwM> listDjBIcL = C10954byG.EZpvd.valueOf().djBIcL();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
        java.util.Iterator<T> it = listDjBIcL.iterator();
        while (it.hasNext()) {
            arrayList.add(((C10854bwM) it.next()).copydefault());
        }
        Intrinsics.copydefault(context);
        java.lang.String strKWHzl = C33069mpW.KWHzl(context, C13754dXa.FragmentManager.getFlagsMask, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("count", ((arrayList.size() / 10) * 10) + Marker.ANY_NON_NULL_MARKER)));
        textView.setText(strKWHzl);
        android.text.TextPaint paint = textView.getPaint();
        float fMeasureText = paint != null ? paint.measureText(strKWHzl) : 0.0f;
        int i = 7;
        if (fMeasureText > OLrzqt(7, context)) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            i = 6;
            if (layoutParams != null) {
                layoutParams.width = OLrzqt(6, context);
            }
            textView.setLayoutParams(layoutParams);
        }
        int i2 = i;
        C14726dqr.OLrzqt.KWHzl(c57440yiU, CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, i2), 22, i2, 0.0f, 22.0f, i2 - 1);
    }

    public final int OLrzqt(int i, android.content.Context context) {
        return (C33570myu.AEQbTJ() - ((C55298xhM.copydefault(22.0f, context) * i) + (i * C55298xhM.copydefault(8.0f, context)))) - C55298xhM.copydefault(64.0f, context);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            SPUtils.remove(str + "-home_onboard", "homeOnboardLottie");
        } catch (java.lang.Exception unused) {
        }
    }

    public final void EZpvd() {
        try {
            SPUtils.clear("homeOnboardLottie");
        } catch (java.lang.Exception unused) {
        }
    }
}
