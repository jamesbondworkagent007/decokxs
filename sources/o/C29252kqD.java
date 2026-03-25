package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.market.features.meme.domain.model.MemeProtocolUiData;
import com.okinc.business.market.features.meme.domain.model.MemeSocialMediaData;
import com.okinc.business.market.features.meme.domain.model.MemeTagsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;

/* JADX INFO: renamed from: o.kqD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29252kqD {
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KWHzl(C21540hDd c21540hDd, C29250kqB c29250kqB, Function1<? super C29250kqB, Unit> function1) {
        android.content.Context context = c21540hDd.getRoot().getContext();
        java.lang.String strAkhnZx = c29250kqB.AkhnZx();
        if (strAkhnZx == null) {
            strAkhnZx = c29250kqB.DbNXlk();
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx))) {
                strAkhnZx = null;
            }
        } else {
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx))) {
                strAkhnZx = null;
            }
            if (strAkhnZx == null) {
            }
        }
        if (strAkhnZx != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            android.widget.ImageView imageView = c21540hDd.gEmmrt;
            imageView.setOnClickListener(new Activity(imageView, 1000L, function1, c29250kqB));
        }
        MemeProtocolUiData memeProtocolUiDataCopydefault = c29250kqB.copydefault();
        int i = C52761wXj.ActionBar.DCUTEI;
        Intrinsics.copydefault(context);
        int iCopydefault = C25382ivf.copydefault(i, context);
        java.lang.Integer numOLrzqt = memeProtocolUiDataCopydefault.OLrzqt();
        int iIntValue = numOLrzqt != null ? numOLrzqt.intValue() : iCopydefault;
        java.lang.Integer numAEQbTJ = memeProtocolUiDataCopydefault.AEQbTJ();
        if (numAEQbTJ != null || (numAEQbTJ = memeProtocolUiDataCopydefault.OLrzqt()) != null) {
            iCopydefault = numAEQbTJ.intValue();
        }
        int i2 = iCopydefault;
        android.widget.ImageView imageView2 = c21540hDd.valueOf;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(c29250kqB.AuCTel() ? 0 : 8);
        if (c29250kqB.AuCTel()) {
            android.widget.ImageView imageView3 = c21540hDd.valueOf;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            C25386ivj.loadSquareImage$default(imageView3, c29250kqB.DbNXlk(), C55298xhM.copydefault(16.0f, context), null, 4, null);
        }
        android.widget.ImageView imageView4 = c21540hDd.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(imageView4, "");
        C25386ivj.EZpvd(imageView4, c29250kqB.DbNXlk(), C55298xhM.copydefault(5.625f, context), C52761wXj.TaskDescription.dzCpvv);
        android.widget.ImageView imageView5 = c21540hDd.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageView5, "");
        C28884kjG.EZpvd(imageView5, memeProtocolUiDataCopydefault.copydefault(), C55298xhM.dp2px$default(1.0f, null, 1, null), iIntValue, i2, C52761wXj.TaskDescription.dzCpvv, (32 & 32) != 0 ? 0 : 0, (32 & 64) != 0 ? null : java.lang.Integer.valueOf(C25382ivf.copydefault(C52761wXj.Activity.EZpvd, context)));
    }

    public static final void AkhnZx(C21540hDd c21540hDd, C29250kqB c29250kqB) {
        c21540hDd.getNewProxyInstance.setText(c29250kqB.values());
        c21540hDd.iwGUEr.setText(c29250kqB.isConnected());
    }

    /* JADX INFO: renamed from: o.kqD$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ Function1 EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C29250kqB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, Function1 function1, C29250kqB c29250kqB) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = function1;
            this.copydefault = c29250kqB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.invoke(this.copydefault);
            }
        }
    }

    public static final void DbNXlk(C21540hDd c21540hDd, C29250kqB c29250kqB) {
        int iCopydefault;
        boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) c29250kqB.djBIcL());
        android.widget.TextView textView = c21540hDd.fARcdN;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(zOLrzqt ? 0 : 8);
        android.widget.ImageView imageView = c21540hDd.djBIcL;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(zOLrzqt ? 0 : 8);
        java.lang.String strDjBIcL = c29250kqB.djBIcL();
        if (strDjBIcL != null) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            long jValueOf = C33129mqd.valueOf(strDjBIcL);
            android.widget.TextView textView2 = c21540hDd.fARcdN;
            textView2.setText(C25322iuY.OLrzqt.EZpvd(strDjBIcL));
            if (jCurrentTimeMillis - jValueOf < java.util.concurrent.TimeUnit.DAYS.toMillis(1L)) {
                int i = C52761wXj.ActionBar.DCUTEI;
                android.content.Context context = textView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iCopydefault = C25382ivf.copydefault(i, context);
            } else {
                int i2 = C52761wXj.Activity.QwvEab;
                android.content.Context context2 = textView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                iCopydefault = C25382ivf.copydefault(i2, context2);
            }
            textView2.setTextColor(iCopydefault);
        }
    }

    public static final void AYXKKw(C21540hDd c21540hDd, C29250kqB c29250kqB) {
        MemeSocialMediaData memeSocialMediaDataEjfBZ = c29250kqB.ejfBZ();
        boolean z = memeSocialMediaDataEjfBZ != null;
        if (memeSocialMediaDataEjfBZ != null) {
            android.widget.ImageView imageView = c21540hDd.AYXKKw;
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(memeSocialMediaDataEjfBZ.AYXKKw());
            if (drawableKWHzl != null) {
                java.lang.Integer numGEmmrt = memeSocialMediaDataEjfBZ.gEmmrt();
                if (numGEmmrt != null) {
                    C33057mpK.copydefault(drawableKWHzl, numGEmmrt.intValue());
                }
            } else {
                drawableKWHzl = null;
            }
            imageView.setImageDrawable(drawableKWHzl);
        }
        android.widget.ImageView imageView2 = c21540hDd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(z ? 0 : 8);
        android.widget.ImageView imageView3 = c21540hDd.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(z ? 0 : 8);
    }

    public static final void djBIcL(C21540hDd c21540hDd, C29250kqB c29250kqB) {
        int iCopydefault;
        java.lang.String percent$default;
        int iCopydefault2;
        android.content.Context context = c21540hDd.getRoot().getContext();
        MemeTagsData memeTagsDataOLrzqt = c29250kqB.OLrzqt();
        if (memeTagsDataOLrzqt.valueOf()) {
            int i = C52761wXj.Activity.gdmIOq;
            Intrinsics.copydefault(context);
            iCopydefault = C25382ivf.copydefault(i, context);
        } else if (C23313hvq.EZpvd(memeTagsDataOLrzqt.EZpvd(), "0.2")) {
            int i2 = C52761wXj.ActionBar.OuxcSI;
            Intrinsics.copydefault(context);
            iCopydefault = C25382ivf.copydefault(i2, context);
        } else {
            int i3 = C52761wXj.ActionBar.DCUTEI;
            Intrinsics.copydefault(context);
            iCopydefault = C25382ivf.copydefault(i3, context);
        }
        android.widget.TextView textView = c21540hDd.fJNWhG;
        java.lang.String percent$default2 = "--";
        if (memeTagsDataOLrzqt.valueOf()) {
            percent$default = context.getString(C23274hvD.Fragment.SlnMSS);
        } else if (memeTagsDataOLrzqt.EZpvd().length() == 0) {
            percent$default = "--";
        } else {
            percent$default = (C23313hvq.KWHzl(memeTagsDataOLrzqt.EZpvd(), "0.01") && C23313hvq.OLrzqt(memeTagsDataOLrzqt.EZpvd(), "0")) ? "<1%" : C23311hvo.formatPercent$default(memeTagsDataOLrzqt.EZpvd(), false, 0, 0, null, null, 29, null);
        }
        textView.setText(percent$default);
        c21540hDd.fJNWhG.setTextColor(iCopydefault);
        c21540hDd.AEQbTJ.setImageTintList(android.content.res.ColorStateList.valueOf(iCopydefault));
        if (C23313hvq.EZpvd(memeTagsDataOLrzqt.AEQbTJ(), "0.1")) {
            iCopydefault2 = C25382ivf.copydefault(C52761wXj.ActionBar.OuxcSI, context);
        } else {
            iCopydefault2 = C25382ivf.copydefault(C52761wXj.ActionBar.DCUTEI, context);
        }
        android.widget.TextView textView2 = c21540hDd.isConnected;
        if (memeTagsDataOLrzqt.AEQbTJ().length() != 0) {
            percent$default2 = (C23313hvq.KWHzl(memeTagsDataOLrzqt.AEQbTJ(), "0.01") && C23313hvq.OLrzqt(memeTagsDataOLrzqt.AEQbTJ(), "0")) ? "<1%" : C23311hvo.formatPercent$default(memeTagsDataOLrzqt.AEQbTJ(), false, 0, 0, null, null, 29, null);
        }
        textView2.setText(percent$default2);
        c21540hDd.isConnected.setTextColor(iCopydefault2);
        c21540hDd.EZpvd.setImageTintList(android.content.res.ColorStateList.valueOf(iCopydefault2));
    }

    public static final void gEmmrt(C21540hDd c21540hDd, C29250kqB c29250kqB) {
        int iCopydefault;
        android.widget.TextView textView = c21540hDd.fIwbmz;
        java.lang.String strAEQbTJ = c29250kqB.AEQbTJ();
        java.lang.String scientificCurrency$default = strAEQbTJ != null ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, strAEQbTJ, true, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null) : null;
        if (scientificCurrency$default == null) {
            scientificCurrency$default = "";
        }
        textView.setText(scientificCurrency$default);
        if (strAEQbTJ == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
            int i = C52761wXj.Activity.fdOvFl;
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iCopydefault = C25382ivf.copydefault(i, context);
        } else if (C23313hvq.KWHzl(strAEQbTJ, "30000")) {
            int i2 = C52761wXj.Activity.RAQtXZ;
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iCopydefault = C25382ivf.copydefault(i2, context2);
        } else if (C23313hvq.valueOf(strAEQbTJ, "200000")) {
            int i3 = C52761wXj.Activity.gdmIOq;
            android.content.Context context3 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            iCopydefault = C25382ivf.copydefault(i3, context3);
        } else {
            int i4 = C52761wXj.ActionBar.DCUTEI;
            android.content.Context context4 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            iCopydefault = C25382ivf.copydefault(i4, context4);
        }
        textView.setTextColor(iCopydefault);
        android.widget.TextView textView2 = c21540hDd.hDKMBd;
        java.lang.String strFJNWhG = c29250kqB.fJNWhG();
        java.lang.String scientificCurrency$default2 = strFJNWhG != null ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, strFJNWhG, true, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null) : null;
        textView2.setText(scientificCurrency$default2 != null ? scientificCurrency$default2 : "");
    }

    public static final void AhwBna(C21540hDd c21540hDd, C29250kqB c29250kqB) {
        c21540hDd.KWHzl.setData(c29250kqB.EZpvd());
    }

    public static final void OLrzqt(C21540hDd c21540hDd) {
        c21540hDd.copydefault.setCompoundDrawablesWithIntrinsicBounds(C57406yhn.Activity.aKErDB, 0, 0, 0);
    }
}
