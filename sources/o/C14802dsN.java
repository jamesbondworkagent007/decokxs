package o;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.dapp.net.DappListBean;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.C52761wXj;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dsN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14802dsN extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public DappTabData AEQbTJ;
    public AbstractC13472dMp EZpvd;

    /* JADX INFO: renamed from: o.dsN$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dsN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C14802dsN OLrzqt() {
            return new C14802dsN();
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.EZpvd = (AbstractC13472dMp) DataBindingUtil.inflate(getCustomLayoutInflater(), dLX.Fragment.DbNXlk, constraintLayout, true);
        this.AEQbTJ = C15112dyF.AEQbTJ.OLrzqt();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String mUrl;
        java.lang.String mUrl2;
        java.lang.String title;
        PlatformItem mItem;
        java.lang.String logo;
        java.lang.String logo2;
        PlatformItem mItem2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        DappTabData dappTabData = this.AEQbTJ;
        AbstractC13472dMp abstractC13472dMp = null;
        if (dappTabData == null || (mItem = dappTabData.getMItem()) == null || (logo = mItem.getLogo()) == null || logo.length() <= 0) {
            DappTabData dappTabData2 = this.AEQbTJ;
            if ((dappTabData2 != null ? dappTabData2.getIcon() : null) != null) {
                AbstractC13472dMp abstractC13472dMp2 = this.EZpvd;
                if (abstractC13472dMp2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC13472dMp2 = null;
                }
                android.widget.ImageView imageView = abstractC13472dMp2.copydefault;
                DappTabData dappTabData3 = this.AEQbTJ;
                imageView.setImageBitmap(dappTabData3 != null ? dappTabData3.getIcon() : null);
            } else {
                AbstractC13472dMp abstractC13472dMp3 = this.EZpvd;
                if (abstractC13472dMp3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC13472dMp3 = null;
                }
                abstractC13472dMp3.copydefault.setImageResource(dLX.ActionBar.AYXKKw);
            }
        } else {
            AbstractC13472dMp abstractC13472dMp4 = this.EZpvd;
            if (abstractC13472dMp4 == null) {
                Intrinsics.gEmmrt("");
                abstractC13472dMp4 = null;
            }
            android.widget.ImageView imageView2 = abstractC13472dMp4.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            DappTabData dappTabData4 = this.AEQbTJ;
            if (dappTabData4 == null || (mItem2 = dappTabData4.getMItem()) == null || (logo2 = mItem2.getLogo()) == null) {
                logo2 = "";
            }
            C33054mpH.AEQbTJ(imageView2, logo2, dLX.ActionBar.AYXKKw);
        }
        AbstractC13472dMp abstractC13472dMp5 = this.EZpvd;
        if (abstractC13472dMp5 == null) {
            Intrinsics.gEmmrt("");
            abstractC13472dMp5 = null;
        }
        C55001xbh c55001xbhAkhnZx = abstractC13472dMp5.OLrzqt.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.addTextChangedListener(new Activity());
        }
        AbstractC13472dMp abstractC13472dMp6 = this.EZpvd;
        if (abstractC13472dMp6 == null) {
            Intrinsics.gEmmrt("");
            abstractC13472dMp6 = null;
        }
        C55001xbh c55001xbhAkhnZx2 = abstractC13472dMp6.OLrzqt.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            Editable.Factory factory = Editable.Factory.getInstance();
            DappTabData dappTabData5 = this.AEQbTJ;
            if (dappTabData5 == null || (title = dappTabData5.getTitle()) == null) {
                title = "";
            }
            c55001xbhAkhnZx2.setText(factory.newEditable(title));
        }
        AbstractC13472dMp abstractC13472dMp7 = this.EZpvd;
        if (abstractC13472dMp7 == null) {
            Intrinsics.gEmmrt("");
            abstractC13472dMp7 = null;
        }
        abstractC13472dMp7.OLrzqt.EZpvd(true);
        AbstractC13472dMp abstractC13472dMp8 = this.EZpvd;
        if (abstractC13472dMp8 == null) {
            Intrinsics.gEmmrt("");
            abstractC13472dMp8 = null;
        }
        abstractC13472dMp8.AYXKKw.setState(3);
        AbstractC13472dMp abstractC13472dMp9 = this.EZpvd;
        if (abstractC13472dMp9 == null) {
            Intrinsics.gEmmrt("");
            abstractC13472dMp9 = null;
        }
        C55001xbh c55001xbhAkhnZx3 = abstractC13472dMp9.AYXKKw.AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            Editable.Factory factory2 = Editable.Factory.getInstance();
            DappTabData dappTabData6 = this.AEQbTJ;
            if (dappTabData6 == null || (mUrl2 = dappTabData6.getMUrl()) == null) {
                mUrl2 = "";
            }
            c55001xbhAkhnZx3.setText(factory2.newEditable(mUrl2));
        }
        AbstractC13472dMp abstractC13472dMp10 = this.EZpvd;
        if (abstractC13472dMp10 == null) {
            Intrinsics.gEmmrt("");
            abstractC13472dMp10 = null;
        }
        C55001xbh c55001xbhAkhnZx4 = abstractC13472dMp10.AYXKKw.AkhnZx();
        if (c55001xbhAkhnZx4 != null) {
            c55001xbhAkhnZx4.setEllipsize(TextUtils.TruncateAt.END);
        }
        AbstractC13472dMp abstractC13472dMp11 = this.EZpvd;
        if (abstractC13472dMp11 == null) {
            Intrinsics.gEmmrt("");
            abstractC13472dMp11 = null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC13472dMp11.AYXKKw.getFieldNames().OLrzqt.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        AbstractC13472dMp abstractC13472dMp12 = this.EZpvd;
        if (abstractC13472dMp12 == null) {
            Intrinsics.gEmmrt("");
            abstractC13472dMp12 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = abstractC13472dMp12.OLrzqt.getFieldNames().OLrzqt.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        AbstractC13472dMp abstractC13472dMp13 = this.EZpvd;
        if (abstractC13472dMp13 == null) {
            Intrinsics.gEmmrt("");
            abstractC13472dMp13 = null;
        }
        abstractC13472dMp13.AYXKKw.EZpvd(false);
        DappTabData dappTabData7 = this.AEQbTJ;
        if (dappTabData7 == null || (mUrl = dappTabData7.getMUrl()) == null || mUrl.length() <= 700) {
            AbstractC13472dMp abstractC13472dMp14 = this.EZpvd;
            if (abstractC13472dMp14 == null) {
                Intrinsics.gEmmrt("");
                abstractC13472dMp14 = null;
            }
            abstractC13472dMp14.AYXKKw.values();
        } else {
            AbstractC13472dMp abstractC13472dMp15 = this.EZpvd;
            if (abstractC13472dMp15 == null) {
                Intrinsics.gEmmrt("");
                abstractC13472dMp15 = null;
            }
            C55008xbo c55008xbo = abstractC13472dMp15.AYXKKw;
            java.lang.String string = getString(dLX.Dialog.AxsJAYaxsJAY);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55008xbo.setErrorText(string);
        }
        AbstractC13472dMp abstractC13472dMp16 = this.EZpvd;
        if (abstractC13472dMp16 == null) {
            Intrinsics.gEmmrt("");
            abstractC13472dMp16 = null;
        }
        abstractC13472dMp16.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.dsP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C14802dsN.copydefault(this.AEQbTJ, view2);
            }
        });
        AbstractC13472dMp abstractC13472dMp17 = this.EZpvd;
        if (abstractC13472dMp17 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC13472dMp = abstractC13472dMp17;
        }
        abstractC13472dMp.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.dsL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C14802dsN.AEQbTJ(this.OLrzqt, view2);
            }
        });
    }

    /* JADX INFO: renamed from: o.dsN$Activity */
    public static final class Activity implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            DappTabData dappTabData;
            java.lang.String mUrl;
            AbstractC13472dMp abstractC13472dMp = null;
            if (java.lang.String.valueOf(editable).length() > 200) {
                AbstractC13472dMp abstractC13472dMp2 = C14802dsN.this.EZpvd;
                if (abstractC13472dMp2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC13472dMp2 = null;
                }
                C55008xbo c55008xbo = abstractC13472dMp2.OLrzqt;
                java.lang.String string = C14802dsN.this.getString(dLX.Dialog.AxsJAYsNCnLh);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c55008xbo.setErrorText(string);
            } else {
                AbstractC13472dMp abstractC13472dMp3 = C14802dsN.this.EZpvd;
                if (abstractC13472dMp3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC13472dMp3 = null;
                }
                abstractC13472dMp3.OLrzqt.values();
            }
            AbstractC13472dMp abstractC13472dMp4 = C14802dsN.this.EZpvd;
            if (abstractC13472dMp4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC13472dMp = abstractC13472dMp4;
            }
            abstractC13472dMp.AEQbTJ.setEnabled(java.lang.String.valueOf(editable).length() > 0 && java.lang.String.valueOf(editable).length() <= 200 && ((dappTabData = C14802dsN.this.AEQbTJ) == null || (mUrl = dappTabData.getMUrl()) == null || mUrl.length() <= 700));
        }
    }

    public static final void copydefault(C14802dsN c14802dsN, android.view.View view) {
        c14802dsN.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(final C14802dsN c14802dsN, android.view.View view) {
        java.lang.String str;
        PlatformItem mItem;
        java.lang.String logo;
        DappTabData dappTabData;
        java.lang.String category;
        PlatformItem mItem2;
        java.lang.String mUrl;
        PlatformItem mItem3;
        java.lang.String mUrl2;
        C15059dxF c15059dxF = new C15059dxF();
        DappTabData dappTabData2 = c14802dsN.AEQbTJ;
        java.lang.String str2 = (dappTabData2 == null || (mUrl2 = dappTabData2.getMUrl()) == null) ? "" : mUrl2;
        AbstractC13472dMp abstractC13472dMp = c14802dsN.EZpvd;
        if (abstractC13472dMp == null) {
            Intrinsics.gEmmrt("");
            abstractC13472dMp = null;
        }
        C55001xbh c55001xbhAkhnZx = abstractC13472dMp.OLrzqt.AkhnZx();
        java.lang.String strValueOf = java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null);
        DappTabData dappTabData3 = c14802dsN.AEQbTJ;
        if (android.text.TextUtils.isEmpty((dappTabData3 == null || (mItem3 = dappTabData3.getMItem()) == null) ? null : mItem3.getLogo())) {
            C14923duc c14923duc = C14923duc.EZpvd;
            DappTabData dappTabData4 = c14802dsN.AEQbTJ;
            logo = c14923duc.AEQbTJ(dappTabData4 != null ? dappTabData4.getMUrl() : null);
        } else {
            DappTabData dappTabData5 = c14802dsN.AEQbTJ;
            if (dappTabData5 == null || (mItem = dappTabData5.getMItem()) == null || (logo = mItem.getLogo()) == null) {
                str = "";
            }
            DappTabData dappTabData6 = c14802dsN.AEQbTJ;
            java.lang.String str3 = (dappTabData6 != null || (mUrl = dappTabData6.getMUrl()) == null) ? "" : mUrl;
            dappTabData = c14802dsN.AEQbTJ;
            if (dappTabData != null || (mItem2 = dappTabData.getMItem()) == null || (category = mItem2.getCategory()) == null) {
                category = "5";
            }
            AbstractC58185ywX<ResponseData<java.lang.Boolean>> abstractC58185ywXCopydefault = c15059dxF.copydefault(0L, 1, str2, strValueOf, str, str3, StringsKt__StringNumberConversionsKt.toIntOrNull(category), 1);
            final Function1 function1 = new Function1() { // from class: o.dsS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14802dsN.copydefault(this.EZpvd, (ResponseData) obj);
                }
            };
            InterfaceC58227yxM<? super ResponseData<java.lang.Boolean>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dsR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14802dsN.EZpvd(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dsU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14802dsN.KWHzl((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dsQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14802dsN.AEQbTJ(function12, obj);
                }
            });
        }
        str = logo;
        DappTabData dappTabData62 = c14802dsN.AEQbTJ;
        if (dappTabData62 != null) {
        }
        dappTabData = c14802dsN.AEQbTJ;
        if (dappTabData != null) {
            category = "5";
        }
        AbstractC58185ywX<ResponseData<java.lang.Boolean>> abstractC58185ywXCopydefault2 = c15059dxF.copydefault(0L, 1, str2, strValueOf, str, str3, StringsKt__StringNumberConversionsKt.toIntOrNull(category), 1);
        final Function1 function13 = new Function1() { // from class: o.dsS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14802dsN.copydefault(this.EZpvd, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<java.lang.Boolean>> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.dsR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14802dsN.EZpvd(function13, obj);
            }
        };
        final Function1 function122 = new Function1() { // from class: o.dsU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14802dsN.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXCopydefault2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.dsQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14802dsN.AEQbTJ(function122, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C14802dsN c14802dsN, ResponseData responseData) {
        C57604ylZ c57604ylZ = C57604ylZ.OLrzqt;
        int i = dLX.Dialog.DXXBbs;
        android.content.Context context = c14802dsN.getContext();
        C57604ylZ.show$default(c57604ylZ, java.lang.Integer.valueOf(i), context != null ? context.getDrawable(C52761wXj.TaskDescription.FYtjSf) : null, 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
        DappListBean dappListBean = new DappListBean(0L, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 4095, (DefaultConstructorMarker) null);
        dappListBean.setFav(true);
        RxBus.AEQbTJ(dappListBean);
        c14802dsN.dismiss();
        C14742drG.KWHzl.copydefault("browser", "add");
        C7323ahf.KWHzl().AEQbTJ("refreshFavourite", null, null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        C57604ylZ.show$default(C57604ylZ.OLrzqt, th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        try {
            if (isAdded()) {
                dismiss();
            } else {
                super.show(fragmentManager, str);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
