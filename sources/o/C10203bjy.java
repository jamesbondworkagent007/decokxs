package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.assets.detail.biz.BaseItem;
import com.okinc.business.defi.assets.detail.biz.NetworkFeeNoticeType;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10203bjy extends RecyclerView.ViewHolder {
    public final AbstractC16987euL KWHzl;

    /* JADX INFO: renamed from: o.bjy$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[NetworkFeeNoticeType.values().length];
            try {
                iArr[NetworkFeeNoticeType.NOTICE_TYPE_NETWORK_FEE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkFeeNoticeType.NOTICE_TYPE_TRANSACTION_FEE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkFeeNoticeType.NOTICE_TYPE_NEGATIVE_FEE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkFeeNoticeType.NOTICE_TYPE_NONE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC16987euL EZpvd() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10203bjy(@NotNull AbstractC16987euL abstractC16987euL) {
        super(abstractC16987euL.getRoot());
        Intrinsics.checkNotNullParameter(abstractC16987euL, "");
        this.KWHzl = abstractC16987euL;
    }

    public final void copydefault(@NotNull BaseItem.FragmentManager fragmentManager, TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        java.lang.CharSequence charSequenceAEQbTJ;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (txIdOrHashHistoryDetail != null && Intrinsics.EZpvd(txIdOrHashHistoryDetail.getX402FreeGas(), java.lang.Boolean.TRUE)) {
            android.widget.ImageView imageView = this.KWHzl.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            this.KWHzl.djBIcL.setVisibility(8);
            this.KWHzl.copydefault.setVisibility(8);
            this.KWHzl.KWHzl.setVisibility(8);
            this.KWHzl.AEQbTJ.setVisibility(8);
            this.KWHzl.AhwBna.setVisibility(8);
            this.KWHzl.EZpvd.setVisibility(0);
            return;
        }
        this.KWHzl.EZpvd.setVisibility(8);
        int iAEQbTJ = (C33570myu.AEQbTJ() - C55298xhM.dpInt$default(64, (android.content.Context) null, 1, (java.lang.Object) null)) / 2;
        java.lang.String strEZpvd = fragmentManager.EZpvd();
        java.lang.String strCopydefault = fragmentManager.copydefault();
        java.lang.String strKWHzl = fragmentManager.KWHzl();
        if (txIdOrHashHistoryDetail != null && txIdOrHashHistoryDetail.getTxStatus() == 1 && C33129mqd.OLrzqt((java.lang.CharSequence) fragmentManager.valueOf())) {
            this.KWHzl.copydefault.setVisibility(8);
            this.KWHzl.KWHzl.setVisibility(8);
            this.KWHzl.AEQbTJ.setVisibility(8);
        } else {
            this.KWHzl.copydefault.getPaint().measureText(C33129mqd.gEmmrt(strEZpvd));
            this.KWHzl.KWHzl.getPaint().measureText(C33129mqd.gEmmrt(strCopydefault));
            this.KWHzl.AEQbTJ.getPaint().measureText(C33129mqd.gEmmrt(strKWHzl));
            this.KWHzl.copydefault.setVisibility(fragmentManager.EZpvd().length() == 0 ? 8 : 0);
            this.KWHzl.KWHzl.setVisibility(8);
            this.KWHzl.AEQbTJ.setVisibility(8);
            android.widget.TextView textView = this.KWHzl.copydefault;
            if (txIdOrHashHistoryDetail != null && txIdOrHashHistoryDetail.getTxType() == 65) {
                charSequenceAEQbTJ = strKWHzl + strEZpvd;
            } else if (fragmentManager.AhwBna()) {
                charSequenceAEQbTJ = C10154bjB.AEQbTJ(strEZpvd + " " + strCopydefault + " " + strKWHzl);
            } else {
                charSequenceAEQbTJ = strEZpvd + " " + strCopydefault + " " + strKWHzl;
            }
            textView.setText(charSequenceAEQbTJ);
        }
        this.KWHzl.gEmmrt.setText(fragmentManager.AEQbTJ());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) fragmentManager.gEmmrt())) {
            this.KWHzl.djBIcL.setVisibility(0);
            this.KWHzl.djBIcL.setText(fragmentManager.gEmmrt());
        } else {
            this.KWHzl.djBIcL.setVisibility(8);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) fragmentManager.valueOf())) {
            this.KWHzl.AhwBna.setVisibility(0);
            this.KWHzl.AhwBna.setText(fragmentManager.valueOf());
        } else {
            this.KWHzl.AhwBna.setVisibility(8);
        }
        if (txIdOrHashHistoryDetail != null && txIdOrHashHistoryDetail.getTxType() == 12) {
            this.KWHzl.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            this.KWHzl.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            this.KWHzl.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
        android.widget.ImageView imageView2 = this.KWHzl.OLrzqt;
        Intrinsics.copydefault(imageView2);
        imageView2.setVisibility(fragmentManager.OLrzqt() != NetworkFeeNoticeType.NOTICE_TYPE_NONE ? 0 : 8);
        imageView2.setOnClickListener(new TaskDescription(imageView2, 1000L, fragmentManager, this));
    }

    /* JADX INFO: renamed from: o.bjy$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C10203bjy KWHzl;
        public final /* synthetic */ BaseItem.FragmentManager OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, BaseItem.FragmentManager fragmentManager, C10203bjy c10203bjy) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = fragmentManager;
            this.KWHzl = c10203bjy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                int i = Application.AEQbTJ[this.OLrzqt.OLrzqt().ordinal()];
                if (i == 1) {
                    android.content.Context context = this.KWHzl.EZpvd().getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    C10154bjB.AEQbTJ(context, C33070mpX.AYXKKw(C13754dXa.FragmentManager.putBitmap), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaMetadataCompatRatingKey), C33070mpX.AYXKKw(C13754dXa.FragmentManager.putText));
                } else if (i == 2) {
                    android.content.Context context2 = this.KWHzl.EZpvd().getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    C10154bjB.AEQbTJ(context2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.putLong), C33070mpX.AYXKKw(C13754dXa.FragmentManager.newPercentageRating), C33070mpX.AYXKKw(C13754dXa.FragmentManager.putText));
                } else if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    android.content.Context context3 = this.KWHzl.EZpvd().getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    C10154bjB.AEQbTJ(context3, C33070mpX.AYXKKw(C13754dXa.FragmentManager.peekSupportActionBar), C33070mpX.AYXKKw(C13754dXa.FragmentManager.bypassOnPanelClosed), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getItem));
                }
            }
        }
    }
}
