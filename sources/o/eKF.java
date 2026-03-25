package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.biz.net.bean.AssetChangeInfo;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C15489eKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes5.dex */
public class eKF<T extends C15489eKf> extends RecyclerView.ViewHolder {
    public AbstractC16746epj AEQbTJ;
    public AbstractC16867ery copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC16867ery AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC16746epj OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eKF(@NotNull android.view.View view, @NotNull AbstractC16867ery abstractC16867ery, AbstractC16746epj abstractC16746epj) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(abstractC16867ery, "");
        this.copydefault = abstractC16867ery;
        this.AEQbTJ = abstractC16746epj;
    }

    public void copydefault(@NotNull T t) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        C15509eKz c15509eKz;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        Intrinsics.checkNotNullParameter(t, "");
        this.copydefault.EZpvd(t);
        android.view.View root = this.copydefault.getRoot();
        C15489eKf c15489eKfOLrzqt = this.copydefault.OLrzqt();
        root.setVisibility(c15489eKfOLrzqt != null ? c15489eKfOLrzqt.AEQbTJ() : 8);
        OKReminder oKReminder = this.copydefault.AhwBna;
        oKReminder.setMessage(t.uzCIH());
        oKReminder.setCloseIconVisibility(false);
        oKReminder.setStyle(2);
        AbstractC16746epj abstractC16746epj = this.AEQbTJ;
        if (abstractC16746epj != null && (textView6 = abstractC16746epj.copydefault) != null) {
            C15489eKf c15489eKfOLrzqt2 = this.copydefault.OLrzqt();
            textView6.setVisibility(c15489eKfOLrzqt2 != null ? c15489eKfOLrzqt2.copydefault() : 8);
        }
        AbstractC16746epj abstractC16746epj2 = this.AEQbTJ;
        if (abstractC16746epj2 != null && (textView5 = abstractC16746epj2.copydefault) != null) {
            textView5.setText(t.AkhnZx());
        }
        AbstractC16746epj abstractC16746epj3 = this.AEQbTJ;
        if (abstractC16746epj3 != null && (c15509eKz = abstractC16746epj3.AkhnZx) != null) {
            c15509eKz.setStatus(t.fJNWhG());
        }
        AbstractC16746epj abstractC16746epj4 = this.AEQbTJ;
        if (abstractC16746epj4 != null && (textView4 = abstractC16746epj4.gEmmrt) != null) {
            textView4.setText(t.fetchVPNInfo());
        }
        AbstractC16746epj abstractC16746epj5 = this.AEQbTJ;
        if (abstractC16746epj5 != null && (textView3 = abstractC16746epj5.gEmmrt) != null) {
            textView3.setTextSize(16.0f);
            textView3.setTextColor(KWHzl(t));
        }
        AbstractC16746epj abstractC16746epj6 = this.AEQbTJ;
        if (abstractC16746epj6 != null && (textView2 = abstractC16746epj6.KWHzl) != null) {
            textView2.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) t.values()) ^ true ? 0 : 8);
        }
        AbstractC16746epj abstractC16746epj7 = this.AEQbTJ;
        if (abstractC16746epj7 != null && (textView = abstractC16746epj7.KWHzl) != null) {
            textView.setText(t.values());
        }
        EZpvd(this.AEQbTJ);
        AEQbTJ(t);
        this.copydefault.executePendingBindings();
        AbstractC16746epj abstractC16746epj8 = this.AEQbTJ;
        if (abstractC16746epj8 != null) {
            copydefault(abstractC16746epj8, t.DbNXlk());
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.widget.ImageView EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, android.widget.ImageView imageView, int i) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = imageView;
            this.copydefault = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C55326xho.toast$default(this.EZpvd.getContext().getString(this.copydefault), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        }
    }

    public final void EZpvd(AbstractC16746epj abstractC16746epj) {
        int iDp2px$default;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        ViewGroup.LayoutParams layoutParams = (abstractC16746epj == null || (textView4 = abstractC16746epj.gEmmrt) == null) ? null : textView4.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (abstractC16746epj != null && (textView2 = abstractC16746epj.copydefault) != null && textView2.getVisibility() == 8 && abstractC16746epj != null && (textView3 = abstractC16746epj.KWHzl) != null && textView3.getVisibility() == 8) {
            iDp2px$default = C55298xhM.dp2px$default(0.0f, null, 1, null);
        } else {
            iDp2px$default = C55298xhM.dp2px$default(15.0f, null, 1, null);
        }
        layoutParams2.setMargins(layoutParams2.getMarginStart(), iDp2px$default, layoutParams2.getMarginEnd(), ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        if (abstractC16746epj == null || (textView = abstractC16746epj.gEmmrt) == null) {
            return;
        }
        textView.setLayoutParams(layoutParams2);
    }

    public final int KWHzl(T t) {
        int i;
        java.lang.Integer claimableStatus = t.AuCTel().getClaimableStatus();
        if (claimableStatus != null && claimableStatus.intValue() == 1) {
            i = C52761wXj.Activity.fdOvFl;
        } else if (t.fJNWhG() == 0) {
            i = C52761wXj.Activity.QwvEab;
        } else {
            i = yDY.gEmmrt(1, 2, 3, 6).contains(java.lang.Integer.valueOf(t.fJNWhG())) ? C52761wXj.Activity.gdmIOq : C52761wXj.Activity.fdOvFl;
        }
        return C33070mpX.copydefault(i);
    }

    public final void AEQbTJ(@NotNull C15489eKf c15489eKf) {
        java.util.List listAhwBna;
        Activity activity;
        C15503eKt c15503eKt;
        C15503eKt c15503eKt2;
        C15503eKt c15503eKt3;
        C15503eKt c15503eKt4;
        C15503eKt c15503eKt5;
        Intrinsics.checkNotNullParameter(c15489eKf, "");
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context = this.copydefault.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
        android.content.Context context2 = this.copydefault.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Activity activity2 = new Activity(16, iTradeRiseDefault$default, C55298xhM.copydefault(22.0f, context2), C52761wXj.Dialog.AEQbTJ);
        java.util.List<AssetChangeInfo> assetChange = c15489eKf.AuCTel().getAssetChange();
        if (assetChange == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new java.util.ArrayList();
            for (java.lang.Object obj : assetChange) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((AssetChangeInfo) obj).getCoinAmount())) {
                    listAhwBna.add(obj);
                }
            }
        }
        java.util.List list = listAhwBna;
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(list.size()), 1) && !c15489eKf.fIwbmz()) {
            int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.DeEinT);
            android.content.Context context3 = this.copydefault.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            activity = new Activity(16, iCopydefault, C55298xhM.copydefault(22.0f, context3), C52761wXj.Dialog.AEQbTJ);
        } else {
            int iCopydefault2 = C33070mpX.copydefault(C52761wXj.Activity.v);
            android.content.Context context4 = this.copydefault.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            activity = new Activity(14, iCopydefault2, C55298xhM.copydefault(16.0f, context4), C52761wXj.Dialog.KWHzl);
        }
        Activity activity3 = activity;
        AbstractC16746epj abstractC16746epj = this.AEQbTJ;
        if (abstractC16746epj != null && (c15503eKt5 = abstractC16746epj.values) != null) {
            c15503eKt5.setVisibility(8);
        }
        AbstractC16746epj abstractC16746epj2 = this.AEQbTJ;
        if (abstractC16746epj2 != null && (c15503eKt4 = abstractC16746epj2.DbNXlk) != null) {
            c15503eKt4.setVisibility(8);
        }
        AbstractC16746epj abstractC16746epj3 = this.AEQbTJ;
        if (abstractC16746epj3 != null && (c15503eKt3 = abstractC16746epj3.AYXKKw) != null) {
            c15503eKt3.setVisibility(8);
        }
        boolean z = c15489eKf.AuCTel().getTxType() == 26;
        boolean z2 = c15489eKf.AuCTel().getTxType() == 81 || c15489eKf.AuCTel().getTxType() == 82;
        if (C33129mqd.copydefault((java.lang.Object) java.lang.Integer.valueOf(list.size()), (java.lang.Object) 1)) {
            AssetChangeInfo assetChangeInfo = z2 ? null : (AssetChangeInfo) list.get(0);
            AbstractC16746epj abstractC16746epj4 = this.AEQbTJ;
            EZpvd(assetChangeInfo, abstractC16746epj4 != null ? abstractC16746epj4.values : null, activity2, activity3, z);
        }
        if (C33129mqd.copydefault((java.lang.Object) java.lang.Integer.valueOf(list.size()), (java.lang.Object) 2)) {
            AssetChangeInfo assetChangeInfo2 = z2 ? null : (AssetChangeInfo) list.get(1);
            AbstractC16746epj abstractC16746epj5 = this.AEQbTJ;
            EZpvd(assetChangeInfo2, abstractC16746epj5 != null ? abstractC16746epj5.DbNXlk : null, activity2, activity3, z);
        }
        if (c15489eKf.fIwbmz()) {
            AbstractC16746epj abstractC16746epj6 = this.AEQbTJ;
            if (abstractC16746epj6 == null || (c15503eKt = abstractC16746epj6.AYXKKw) == null) {
                return;
            }
            c15503eKt.setVisibility(0);
            c15503eKt.setTextSize(activity3.EZpvd());
            c15503eKt.setAutoSizeTextTypeFixWithConfiguration(12.0f, activity3.EZpvd(), 2);
            ViewGroup.LayoutParams layoutParams = c15503eKt.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = activity3.OLrzqt();
            }
            c15503eKt.setTextColor(activity3.copydefault());
            c15503eKt.setTypeface(ResourcesCompat.getFont(c15503eKt.getContext(), activity3.AEQbTJ()));
            java.lang.String str = "-" + c15489eKf.AuCTel().getPayAmount();
            AbstractC16746epj abstractC16746epj7 = this.AEQbTJ;
            if (abstractC16746epj7 != null && (c15503eKt2 = abstractC16746epj7.AYXKKw) != null) {
                C15503eKt.setText$default(c15503eKt2, str, " ", c15489eKf.AuCTel().getPayCurrency(), false, 8, null);
            }
        }
        if (C33129mqd.copydefault((java.lang.Object) java.lang.Integer.valueOf(list.size()), (java.lang.Object) 3)) {
            if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(list.size()), 3)) {
                AbstractC16746epj abstractC16746epj8 = this.AEQbTJ;
                EZpvd(abstractC16746epj8 != null ? abstractC16746epj8.AYXKKw : null, activity3);
            } else {
                AssetChangeInfo assetChangeInfo3 = z2 ? null : (AssetChangeInfo) list.get(2);
                AbstractC16746epj abstractC16746epj9 = this.AEQbTJ;
                EZpvd(assetChangeInfo3, abstractC16746epj9 != null ? abstractC16746epj9.AYXKKw : null, activity2, activity3, z);
            }
        }
    }

    public final void EZpvd(AssetChangeInfo assetChangeInfo, C15503eKt c15503eKt, @NotNull Activity activity, @NotNull Activity activity2, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(activity2, "");
        if (assetChangeInfo == null || c15503eKt == null) {
            return;
        }
        java.lang.String strAEQbTJ = z ? "" : eKR.OLrzqt.AEQbTJ(assetChangeInfo);
        c15503eKt.setVisibility(0);
        if (C59449zhJ.startsWith$default(strAEQbTJ, Marker.ANY_NON_NULL_MARKER, false, 2, null)) {
            c15503eKt.setTextSize(activity.EZpvd());
            c15503eKt.setAutoSizeTextTypeFixWithConfiguration(12.0f, 16.0f, 2);
            c15503eKt.getLayoutParams().height = activity.OLrzqt();
            c15503eKt.setTextColor(activity.copydefault());
            c15503eKt.setTypeface(ResourcesCompat.getFont(c15503eKt.getContext(), activity.AEQbTJ()));
        } else {
            c15503eKt.setTextSize(activity2.EZpvd());
            c15503eKt.setAutoSizeTextTypeFixWithConfiguration(12.0f, activity2.EZpvd(), 2);
            c15503eKt.getLayoutParams().height = activity2.OLrzqt();
            c15503eKt.setTextColor(activity2.copydefault());
            c15503eKt.setTypeface(ResourcesCompat.getFont(c15503eKt.getContext(), activity2.AEQbTJ()));
        }
        java.lang.String coinSymbol = assetChangeInfo.getCoinSymbol();
        C15503eKt.setText$default(c15503eKt, strAEQbTJ, " ", coinSymbol == null ? "" : coinSymbol, false, 8, null);
    }

    public final void EZpvd(C15503eKt c15503eKt, Activity activity) {
        if (c15503eKt == null) {
            return;
        }
        c15503eKt.setVisibility(0);
        c15503eKt.setTextSize(activity.EZpvd());
        c15503eKt.setAutoSizeTextTypeFixWithConfiguration(12.0f, activity.EZpvd(), 2);
        c15503eKt.getLayoutParams().height = activity.OLrzqt();
        c15503eKt.setTextColor(activity.copydefault());
        C15503eKt.setText$default(c15503eKt, "", "", "...", false, 8, null);
        c15503eKt.setTypeface(ResourcesCompat.getFont(c15503eKt.getContext(), activity.AEQbTJ()));
    }

    public final void OLrzqt(@NotNull C15489eKf c15489eKf) {
        android.widget.ImageView imageView;
        java.util.List<java.lang.String> coinImgUrls;
        java.lang.String str;
        java.util.List<java.lang.String> coinImgUrls2;
        java.lang.String str2;
        java.lang.String str3;
        android.widget.ImageView imageView2;
        java.util.List<AssetChangeInfo> assetChange;
        AssetChangeInfo assetChangeInfo;
        java.util.List<AssetChangeInfo> assetChange2;
        AssetChangeInfo assetChangeInfo2;
        AssetChangeInfo assetChangeInfo3;
        android.widget.ImageView imageView3;
        android.widget.ImageView imageView4;
        Intrinsics.checkNotNullParameter(c15489eKf, "");
        AbstractC16746epj abstractC16746epj = this.AEQbTJ;
        if (abstractC16746epj != null && (imageView4 = abstractC16746epj.AhwBna) != null) {
            imageView4.setVisibility(8);
        }
        AbstractC16746epj abstractC16746epj2 = this.AEQbTJ;
        if (abstractC16746epj2 != null && (imageView3 = abstractC16746epj2.valueOf) != null) {
            imageView3.setVisibility(8);
        }
        if (c15489eKf.ejfBZ() || c15489eKf.fARcdN()) {
            java.util.List<java.lang.String> coinImgUrls3 = c15489eKf.AuCTel().getCoinImgUrls();
            if (C33129mqd.copydefault((java.lang.Object) (coinImgUrls3 != null ? java.lang.Integer.valueOf(coinImgUrls3.size()) : null), (java.lang.Object) 1)) {
                java.util.List<java.lang.String> coinImgUrls4 = c15489eKf.AuCTel().getCoinImgUrls();
                if (coinImgUrls4 != null && (str3 = coinImgUrls4.get(0)) != null) {
                    AbstractC16746epj abstractC16746epj3 = this.AEQbTJ;
                    EZpvd(abstractC16746epj3 != null ? abstractC16746epj3.djBIcL : null, str3, eKR.getPlaceholder$default(eKR.OLrzqt, c15489eKf, null, 2, null));
                }
            } else {
                AbstractC16746epj abstractC16746epj4 = this.AEQbTJ;
                if (abstractC16746epj4 != null && (imageView = abstractC16746epj4.djBIcL) != null) {
                    imageView.setImageResource(eKR.OLrzqt.AEQbTJ(c15489eKf, null));
                }
            }
            java.util.List<java.lang.String> coinImgUrls5 = c15489eKf.AuCTel().getCoinImgUrls();
            if (C33129mqd.copydefault((java.lang.Object) (coinImgUrls5 != null ? java.lang.Integer.valueOf(coinImgUrls5.size()) : null), (java.lang.Object) 2) && (coinImgUrls2 = c15489eKf.AuCTel().getCoinImgUrls()) != null && (str2 = coinImgUrls2.get(1)) != null) {
                AbstractC16746epj abstractC16746epj5 = this.AEQbTJ;
                EZpvd(abstractC16746epj5 != null ? abstractC16746epj5.valueOf : null, str2, eKR.getPlaceholder$default(eKR.OLrzqt, c15489eKf, null, 2, null));
            }
            java.util.List<java.lang.String> coinImgUrls6 = c15489eKf.AuCTel().getCoinImgUrls();
            if (!C33129mqd.copydefault((java.lang.Object) (coinImgUrls6 != null ? java.lang.Integer.valueOf(coinImgUrls6.size()) : null), (java.lang.Object) 3) || (coinImgUrls = c15489eKf.AuCTel().getCoinImgUrls()) == null || (str = coinImgUrls.get(2)) == null) {
                return;
            }
            AbstractC16746epj abstractC16746epj6 = this.AEQbTJ;
            EZpvd(abstractC16746epj6 != null ? abstractC16746epj6.AhwBna : null, str, eKR.getPlaceholder$default(eKR.OLrzqt, c15489eKf, null, 2, null));
            return;
        }
        java.util.List<AssetChangeInfo> assetChange3 = c15489eKf.AuCTel().getAssetChange();
        if (C33129mqd.copydefault((java.lang.Object) (assetChange3 != null ? java.lang.Integer.valueOf(assetChange3.size()) : null), (java.lang.Object) 1)) {
            java.util.List<AssetChangeInfo> assetChange4 = c15489eKf.AuCTel().getAssetChange();
            if (assetChange4 != null && (assetChangeInfo3 = assetChange4.get(0)) != null) {
                AbstractC16746epj abstractC16746epj7 = this.AEQbTJ;
                EZpvd(abstractC16746epj7 != null ? abstractC16746epj7.djBIcL : null, assetChangeInfo3.getCoinImgUrl(), eKR.OLrzqt.AEQbTJ(c15489eKf, assetChangeInfo3));
            }
        } else {
            AbstractC16746epj abstractC16746epj8 = this.AEQbTJ;
            if (abstractC16746epj8 != null && (imageView2 = abstractC16746epj8.djBIcL) != null) {
                imageView2.setImageResource(eKR.OLrzqt.AEQbTJ(c15489eKf, null));
            }
        }
        java.util.List<AssetChangeInfo> assetChange5 = c15489eKf.AuCTel().getAssetChange();
        if (C33129mqd.copydefault((java.lang.Object) (assetChange5 != null ? java.lang.Integer.valueOf(assetChange5.size()) : null), (java.lang.Object) 2) && (assetChange2 = c15489eKf.AuCTel().getAssetChange()) != null && (assetChangeInfo2 = assetChange2.get(1)) != null) {
            AbstractC16746epj abstractC16746epj9 = this.AEQbTJ;
            EZpvd(abstractC16746epj9 != null ? abstractC16746epj9.valueOf : null, assetChangeInfo2.getCoinImgUrl(), eKR.OLrzqt.AEQbTJ(c15489eKf, assetChangeInfo2));
        }
        java.util.List<AssetChangeInfo> assetChange6 = c15489eKf.AuCTel().getAssetChange();
        if (!C33129mqd.copydefault((java.lang.Object) (assetChange6 != null ? java.lang.Integer.valueOf(assetChange6.size()) : null), (java.lang.Object) 3) || (assetChange = c15489eKf.AuCTel().getAssetChange()) == null || (assetChangeInfo = assetChange.get(2)) == null) {
            return;
        }
        AbstractC16746epj abstractC16746epj10 = this.AEQbTJ;
        EZpvd(abstractC16746epj10 != null ? abstractC16746epj10.AhwBna : null, assetChangeInfo.getCoinImgUrl(), eKR.OLrzqt.AEQbTJ(c15489eKf, assetChangeInfo));
    }

    public final void EZpvd(android.widget.ImageView imageView, java.lang.String str, int i) {
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.KWHzl(imageView).EZpvd(str);
        android.content.Context context = this.itemView.getContext();
        int i2 = C52761wXj.Activity.invokespecialDPHOMC;
        android.content.Context context2 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C5335Nt c5335NtEZpvd2 = c5335NtEZpvd.EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(context, 0.5f, C33070mpX.OLrzqt(i2, context2), false, 8, null));
        C5448Sc c5448Sc = new C5448Sc();
        c5448Sc.AEQbTJ(this.itemView.getContext().getDrawable(i));
        c5448Sc.EZpvd(this.itemView.getContext().getDrawable(i));
        c5448Sc.OLrzqt(this.itemView.getContext().getDrawable(i));
        c5335NtEZpvd2.OLrzqt((RX<?>) c5448Sc).EZpvd(imageView);
    }

    public final void copydefault(AbstractC16746epj abstractC16746epj, java.lang.String str) {
        C57304yfr c57304yfr = C57304yfr.copydefault;
        AppCompatImageView appCompatImageView = abstractC16746epj.isConnected;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        c57304yfr.copydefault(appCompatImageView, 8, 8, 8, 8);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "")) {
            abstractC16746epj.isConnected.setVisibility(8);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "phishing")) {
            AppCompatImageView appCompatImageView2 = abstractC16746epj.isConnected;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            copydefault(appCompatImageView2, C52761wXj.TaskDescription.zFZsbn, C13754dXa.FragmentManager.setSupportProgressBarIndeterminate);
        } else {
            AppCompatImageView appCompatImageView3 = abstractC16746epj.isConnected;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
            copydefault(appCompatImageView3, C52761wXj.TaskDescription.ZpNRhN, C13754dXa.FragmentManager.setSupportProgress);
        }
    }

    public final void copydefault(android.widget.ImageView imageView, int i, int i2) {
        imageView.setVisibility(0);
        imageView.setImageResource(i);
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, imageView, i2));
    }

    public static final class Activity {
        public final int EZpvd;
        public final int KWHzl;
        public final int OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
            if ((i5 & 1) != 0) {
                i = activity.EZpvd;
            }
            if ((i5 & 2) != 0) {
                i2 = activity.KWHzl;
            }
            if ((i5 & 4) != 0) {
                i3 = activity.OLrzqt;
            }
            if ((i5 & 8) != 0) {
                i4 = activity.copydefault;
            }
            return activity.EZpvd(i, i2, i3, i4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(int i, int i2, int i3, int i4) {
            return new Activity(i, i2, i3, i4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.EZpvd == activity.EZpvd && this.KWHzl == activity.KWHzl && this.OLrzqt == activity.OLrzqt && this.copydefault == activity.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((java.lang.Integer.hashCode(this.EZpvd) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UIInfo(textSize=" + this.EZpvd + ", textColor=" + this.KWHzl + ", textHeight=" + this.OLrzqt + ", font=" + this.copydefault + ")";
        }

        public Activity(int i, int i2, int i3, int i4) {
            this.EZpvd = i;
            this.KWHzl = i2;
            this.OLrzqt = i3;
            this.copydefault = i4;
        }
    }
}
