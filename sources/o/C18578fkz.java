package o;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.bumptech.glide.Glide;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fkz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18578fkz extends AbstractC32998moE {
    public android.widget.TextView AkhnZx;
    public android.widget.TextView DbNXlk;
    public C19301fyh OLrzqt;
    public android.widget.LinearLayout copydefault;
    public android.widget.LinearLayout djBIcL;
    public android.view.View fetchVPNInfo;
    public C6995aZr gEmmrt;
    public android.widget.TextView isConnected;
    public android.widget.TextView values;
    public java.lang.String AhwBna = "";
    public java.lang.String KWHzl = "";
    public java.lang.String EZpvd = "";
    public final java.lang.String AEQbTJ = "new_eos_account";
    public java.lang.String ejfBZ = "";
    public java.lang.String valueOf = "^[a-z1-5]{12}$";
    public final Observer<java.lang.String> AYXKKw = new Observer() { // from class: o.fkE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            C18578fkz.OLrzqt(this.EZpvd, (java.lang.String) obj);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.DQYQgr;
    }

    public static final void OLrzqt(C18578fkz c18578fkz, java.lang.String str) {
        C6995aZr c6995aZr;
        Intrinsics.checkNotNullParameter(str, "");
        c18578fkz.EZpvd = str;
        java.lang.String str2 = c18578fkz.AEQbTJ + ContainerUtils.FIELD_DELIMITER + str + ContainerUtils.FIELD_DELIMITER + c18578fkz.AhwBna + ContainerUtils.FIELD_DELIMITER + c18578fkz.KWHzl;
        C6995aZr c6995aZr2 = c18578fkz.gEmmrt;
        if (c6995aZr2 != null) {
            C6995aZr.setContent$default(c6995aZr2, str2, false, 0.0f, 6, (java.lang.Object) null);
        }
        android.view.View view = c18578fkz.fetchVPNInfo;
        if (view == null || (c6995aZr = (C6995aZr) view.findViewById(C13754dXa.ActionBar.hasHeart)) == null) {
            return;
        }
        C6995aZr.setContent$default(c6995aZr, str2, false, 0.0f, 6, (java.lang.Object) null);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        AEQbTJ();
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        MutableLiveData<java.lang.String> mutableLiveDataEZpvd;
        C19301fyh c19301fyh = this.OLrzqt;
        if (c19301fyh == null || (mutableLiveDataEZpvd = c19301fyh.EZpvd()) == null) {
            return;
        }
        mutableLiveDataEZpvd.removeObserver(this.AYXKKw);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("id", "")) == null) {
            string = "";
        }
        this.ejfBZ = string;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        this.OLrzqt = (C19301fyh) new ViewModelProvider(fragmentActivityRequireActivity).get(C19301fyh.class);
        this.AkhnZx = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.ActivityResultRegistryCallbackAndContract);
        this.DbNXlk = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.ComponentDialogExternalSyntheticLambda1);
        this.gEmmrt = (C6995aZr) view.findViewById(C13754dXa.ActionBar.hasHeart);
        this.values = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.ActivityResultContractsPickMultipleVisualMediaCompanion);
        this.djBIcL = (android.widget.LinearLayout) view.findViewById(C13754dXa.ActionBar.ICustomTabsServiceStubProxy);
        this.copydefault = (android.widget.LinearLayout) view.findViewById(C13754dXa.ActionBar.extraCallbackWithResult);
        this.isConnected = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.open);
        this.fetchVPNInfo = android.view.View.inflate(getContext(), C13754dXa.TaskDescription.fmdvVn, null);
        java.lang.String str = this.AEQbTJ + ContainerUtils.FIELD_DELIMITER + this.EZpvd + ContainerUtils.FIELD_DELIMITER + this.AhwBna + ContainerUtils.FIELD_DELIMITER + this.KWHzl;
        C6995aZr c6995aZr = this.gEmmrt;
        if (c6995aZr != null) {
            C6995aZr.setContent$default(c6995aZr, str, false, 0.0f, 6, (java.lang.Object) null);
        }
        copydefault();
        android.widget.TextView textView = this.values;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.fkF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C18578fkz.KWHzl(this.OLrzqt, view2);
                }
            });
        }
        android.widget.TextView textView2 = this.isConnected;
        if (textView2 != null) {
            textView2.setText(getString(C13754dXa.FragmentManager.idLUrz));
        }
    }

    public static final void KWHzl(C18578fkz c18578fkz, android.view.View view) {
        android.content.Context context = c18578fkz.getContext();
        if (context != null) {
            c18578fkz.OLrzqt(context, c18578fkz.fetchVPNInfo);
            c18578fkz.OLrzqt();
        }
    }

    private final void AEQbTJ() {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.ejfBZ, true);
        final Function1 function1 = new Function1() { // from class: o.fkC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18578fkz.OLrzqt(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fkA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18578fkz.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fkH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18578fkz.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fkI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18578fkz.KWHzl(function12, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C18578fkz c18578fkz, AbstractC12782ctV abstractC12782ctV) {
        java.lang.String strAEQbTJ;
        MutableLiveData<java.lang.String> mutableLiveDataEZpvd;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        java.lang.String strOLrzqt;
        C13852daR c13852daRODWQjV = abstractC12782ctV.ODWQjV();
        java.lang.String str = "";
        if (c13852daRODWQjV == null || (strAEQbTJ = c13852daRODWQjV.AEQbTJ()) == null) {
            strAEQbTJ = "";
        }
        c18578fkz.AhwBna = strAEQbTJ;
        C13852daR c13852daRODWQjV2 = abstractC12782ctV.ODWQjV();
        if (c13852daRODWQjV2 != null && (strOLrzqt = c13852daRODWQjV2.OLrzqt()) != null) {
            str = strOLrzqt;
        }
        c18578fkz.KWHzl = str;
        android.widget.TextView textView3 = c18578fkz.AkhnZx;
        if (textView3 != null) {
            textView3.setText(c18578fkz.AhwBna);
        }
        android.widget.TextView textView4 = c18578fkz.DbNXlk;
        if (textView4 != null) {
            textView4.setText(c18578fkz.KWHzl);
        }
        android.view.View view = c18578fkz.fetchVPNInfo;
        if (view != null && (textView2 = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.ActivityResultRegistryCallbackAndContract)) != null) {
            textView2.setText(c18578fkz.AhwBna);
        }
        android.view.View view2 = c18578fkz.fetchVPNInfo;
        if (view2 != null && (textView = (android.widget.TextView) view2.findViewById(C13754dXa.ActionBar.ComponentDialogExternalSyntheticLambda1)) != null) {
            textView.setText(c18578fkz.AhwBna);
        }
        C19301fyh c19301fyh = c18578fkz.OLrzqt;
        if (c19301fyh != null && (mutableLiveDataEZpvd = c19301fyh.EZpvd()) != null) {
            mutableLiveDataEZpvd.observeForever(c18578fkz.AYXKKw);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c18578fkz, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void OLrzqt(android.content.Context context, android.view.View view) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        Intrinsics.copydefault(context, "");
        ((android.app.Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        if (view != null) {
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        if (view != null) {
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private final void OLrzqt() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (Pattern.matches(this.valueOf, this.EZpvd)) {
                ActivityC18568fkp activityC18568fkp = activity instanceof ActivityC18568fkp ? (ActivityC18568fkp) activity : null;
                if (activityC18568fkp != null) {
                    android.view.View view = this.fetchVPNInfo;
                    Intrinsics.copydefault(view);
                    activityC18568fkp.share(view);
                    return;
                }
                return;
            }
            C33134mqi.AEQbTJ(getString(C13754dXa.FragmentManager.HJWChPRGtXKC));
        }
    }

    public final void copydefault() {
        C10854bwM c10854bwMAhwBna = C10954byG.EZpvd.valueOf().AhwBna();
        java.lang.String strDbNXlk = c10854bwMAhwBna != null ? c10854bwMAhwBna.DbNXlk() : null;
        if (strDbNXlk == null || strDbNXlk.length() == 0) {
            return;
        }
        Glide.EZpvd(this).EZpvd(strDbNXlk).OLrzqt(new Application());
    }

    /* JADX INFO: renamed from: o.fkz$Application */
    public static final class Application extends AbstractC5454Si<android.graphics.drawable.Drawable> {
        public Application() {
        }

        @Override // o.InterfaceC5462Sq
        public /* bridge */ /* synthetic */ void copydefault(java.lang.Object obj, InterfaceC5460So interfaceC5460So) {
            copydefault((android.graphics.drawable.Drawable) obj, (InterfaceC5460So<? super android.graphics.drawable.Drawable>) interfaceC5460So);
        }

        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            C6995aZr c6995aZr = C18578fkz.this.gEmmrt;
            if (c6995aZr != null) {
                c6995aZr.setLogoBitmap(bitmapDrawable.getBitmap());
            }
        }
    }
}
