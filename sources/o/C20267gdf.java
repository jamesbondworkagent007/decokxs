package o;

import android.os.Build;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TitleModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxExplain;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxInfoItem;
import com.okinc.web3Uilib.bean.TransactionTopHeaderInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC8601bFm;
import o.C13754dXa;
import o.C20197gcO;
import o.C20505giE;
import o.C52761wXj;
import o.InterfaceC9730bbB;

/* JADX INFO: renamed from: o.gdf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C20267gdf<T extends AbstractC8601bFm<?, ?> & InterfaceC9730bbB> extends C20264gdc<T> {
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    @Override // o.C20264gdc, o.AbstractC20202gcT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TransactionTopHeaderInfoBean djBIcL() {
        android.os.Parcelable parcelable;
        java.lang.CharSequence text;
        java.lang.CharSequence charSequence;
        int iCopydefault;
        android.os.Bundle arguments = getArguments();
        java.lang.String light = null;
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (android.os.Parcelable) arguments.getParcelable("tx_title", TitleModuleModel.TitleModel.class);
        } else {
            parcelable = arguments.getParcelable("tx_title");
        }
        TitleModuleModel.TitleModel titleModel = (TitleModuleModel.TitleModel) parcelable;
        if (titleModel == null) {
            return null;
        }
        if (((AbstractC8601bFm) ejfBZ()).DCUTEIddSDPG()) {
            if (C33492mxV.OLrzqt()) {
                TitleModuleModel.ImageItem topImage = titleModel.getTopImage();
                if (topImage != null) {
                    light = topImage.getDark();
                }
            } else {
                TitleModuleModel.ImageItem topImage2 = titleModel.getTopImage();
                if (topImage2 != null) {
                    light = topImage2.getLight();
                }
            }
        } else if (C33492mxV.OLrzqt()) {
            TitleModuleModel.ImageItem image = titleModel.getImage();
            if (image != null) {
                light = image.getDark();
            }
        } else {
            TitleModuleModel.ImageItem image2 = titleModel.getImage();
            if (image2 != null) {
                light = image2.getLight();
            }
        }
        java.lang.String str = light;
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C13754dXa.Activity.ixgjPv);
        if (((AbstractC8601bFm) ejfBZ()).DCUTEIddSDPG()) {
            java.lang.String text2 = titleModel.getTitle().getText();
            java.lang.Boolean identify = titleModel.getTitle().getIdentify();
            boolean zBooleanValue = identify != null ? identify.booleanValue() : false;
            if (text2 == null || text2.length() == 0) {
                text2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getAutoTimeNightModeManager);
                zBooleanValue = false;
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) text2);
            if (zBooleanValue) {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ);
            } else {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.gdmIOq);
            }
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(iCopydefault), 0, text2.length(), 17);
            Unit unit = Unit.INSTANCE;
            text = new android.text.SpannedString(spannableStringBuilder);
        } else {
            text = titleModel.getTitle().getText();
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getAutoTimeNightModeManager);
            if (text == null || text.length() == 0) {
                charSequence = strAYXKKw;
            }
            java.lang.String subTitle = titleModel.getSubTitle();
            java.lang.String str2 = subTitle != null ? "" : subTitle;
            java.lang.String desc = titleModel.getDesc();
            return new TransactionTopHeaderInfoBean(str, drawableKWHzl, charSequence, null, null, str2, desc != null ? "" : desc, "");
        }
        charSequence = text;
        java.lang.String subTitle2 = titleModel.getSubTitle();
        if (subTitle2 != null) {
        }
        java.lang.String desc2 = titleModel.getDesc();
        return new TransactionTopHeaderInfoBean(str, drawableKWHzl, charSequence, null, null, str2, desc2 != null ? "" : desc2, "");
    }

    @Override // o.C20264gdc, o.AbstractC20202gcT
    public java.lang.String EZpvd(boolean z) {
        return ((AbstractC8601bFm) ejfBZ()).EZpvd(z);
    }

    @Override // o.C20264gdc, o.AbstractC20202gcT
    public java.lang.String OLrzqt() {
        return ((AbstractC8601bFm) ejfBZ()).X_();
    }

    @Override // o.AbstractC20082gaF
    public void zLjUOn() {
        TxInfoItem txInfo;
        java.util.List<BaseModel<?>> moduleList;
        java.lang.Object next;
        PreExecTransactionRes preExecTransactionResQSLkRj = ((AbstractC8601bFm) ejfBZ()).QSLkRj();
        if (preExecTransactionResQSLkRj == null || (txInfo = preExecTransactionResQSLkRj.getTxInfo()) == null || (moduleList = txInfo.getModuleList()) == null) {
            return;
        }
        java.util.Iterator<T> it = moduleList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((BaseModel) next) instanceof TxExplain) {
                    break;
                }
            }
        }
        final BaseModel baseModel = (BaseModel) next;
        if (baseModel != null) {
            KeyEventDispatcher.Component activity = getActivity();
            InterfaceC57493yjU interfaceC57493yjU = activity instanceof InterfaceC57493yjU ? (InterfaceC57493yjU) activity : null;
            if (interfaceC57493yjU != null) {
                interfaceC57493yjU.OLrzqt(new Function1() { // from class: o.gdi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C20267gdf.OLrzqt(this.OLrzqt, baseModel, (android.widget.ImageView) obj);
                    }
                });
            }
        }
    }

    public static final Unit OLrzqt(final C20267gdf c20267gdf, final BaseModel baseModel, android.widget.ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "");
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.v);
        Intrinsics.copydefault(drawableKWHzl);
        drawableKWHzl.setBounds(0, 0, C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
        imageView.setImageDrawable(drawableKWHzl);
        imageView.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.gdj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C20267gdf.OLrzqt(this.OLrzqt, baseModel, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(C20267gdf c20267gdf, BaseModel baseModel, android.view.View view) {
        if (c20267gdf.getChildFragmentManager().isStateSaved()) {
            return;
        }
        if (((AbstractC8601bFm) c20267gdf.ejfBZ()).DCUTEIddSDPG()) {
            C20505giE.StateListAnimator stateListAnimator = C20505giE.Companion;
            Intrinsics.copydefault(baseModel, "");
            C20505giE c20505giEEZpvd = stateListAnimator.EZpvd((TxExplain) baseModel);
            androidx.fragment.app.FragmentManager childFragmentManager = c20267gdf.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c20505giEEZpvd.show(childFragmentManager);
            return;
        }
        C20197gcO.TaskDescription taskDescription = C20197gcO.Companion;
        Intrinsics.copydefault(baseModel, "");
        C20197gcO c20197gcOKWHzl = taskDescription.KWHzl((TxExplain) baseModel);
        androidx.fragment.app.FragmentManager childFragmentManager2 = c20267gdf.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
        c20197gcOKWHzl.show(childFragmentManager2);
    }
}
