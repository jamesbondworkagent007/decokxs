package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.biz.net.bean.TxRecord;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC10049bhC;
import o.eKU;
import o.xWD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eKU extends eKF<C15500eKq> {
    public final AbstractC16857ero EZpvd;

    /* JADX WARN: Illegal instructions before constructor call */
    public eKU(@NotNull AbstractC16857ero abstractC16857ero) {
        Intrinsics.checkNotNullParameter(abstractC16857ero, "");
        android.view.View root = abstractC16857ero.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        AbstractC16867ery abstractC16867ery = abstractC16857ero.EZpvd;
        Intrinsics.checkNotNullExpressionValue(abstractC16867ery, "");
        super(root, abstractC16867ery, abstractC16857ero.OLrzqt);
        this.EZpvd = abstractC16857ero;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/eKf;)V */
    @Override // o.eKF
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C15500eKq c15500eKq) {
        java.util.List<java.lang.String> nftImageUrls;
        Intrinsics.checkNotNullParameter(c15500eKq, "");
        super.copydefault(c15500eKq);
        if (c15500eKq.AuCTel().getTxType() != 25 && c15500eKq.AuCTel().getTxType() != 26) {
            OLrzqt((C15489eKf) c15500eKq);
        } else {
            this.EZpvd.OLrzqt.AhwBna.setVisibility(8);
            this.EZpvd.OLrzqt.valueOf.setVisibility(8);
            android.widget.ImageView imageView = this.EZpvd.OLrzqt.djBIcL;
            TxRecord txRecordAuCTel = c15500eKq.AuCTel();
            EZpvd(imageView, txRecordAuCTel != null ? txRecordAuCTel.getContractIcon() : null, eKR.OLrzqt.AEQbTJ(c15500eKq, null));
        }
        this.EZpvd.KWHzl(c15500eKq);
        if (c15500eKq.AuCTel().getNftImageUrls() == null || ((nftImageUrls = c15500eKq.AuCTel().getNftImageUrls()) != null && nftImageUrls.size() == 0)) {
            this.EZpvd.KWHzl.setVisibility(8);
            return;
        }
        this.EZpvd.KWHzl.setVisibility(0);
        java.util.List<java.lang.String> nftImageUrls2 = c15500eKq.AuCTel().getNftImageUrls();
        boolean zAEQbTJ = C33129mqd.AEQbTJ(nftImageUrls2 != null ? java.lang.Integer.valueOf(nftImageUrls2.size()) : null, 6);
        int iAEQbTJ = (C33570myu.AEQbTJ() - C55298xhM.dpInt$default(AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, (android.content.Context) null, 1, (java.lang.Object) null)) / 3;
        java.util.List<java.lang.String> nftImageUrls3 = c15500eKq.AuCTel().getNftImageUrls();
        if (nftImageUrls3 != null) {
            if (zAEQbTJ) {
                nftImageUrls3 = nftImageUrls3.subList(0, 6);
            }
            this.EZpvd.KWHzl.setAdapter(new TaskDescription(nftImageUrls3, zAEQbTJ, iAEQbTJ, c15500eKq));
        }
        if (this.EZpvd.KWHzl.getItemDecorationCount() >= 1) {
            this.EZpvd.KWHzl.removeItemDecorationAt(0);
        }
        final android.content.Context context = this.EZpvd.getRoot().getContext();
        this.EZpvd.KWHzl.setLayoutManager(new GridLayoutManager(context) { // from class: com.okinc.business.defi.wallet.history.viewitembinder.NftViewHolder$bindData$layoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.EZpvd.KWHzl.addItemDecoration(new Activity());
    }

    public static final class Activity extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            super.getItemOffsets(rect, view, recyclerView, state);
            android.content.Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(12, context);
            android.content.Context context2 = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            rect.set(iOLrzqt, 0, 0, C55298xhM.OLrzqt(12, context2));
        }
    }

    public static final class TaskDescription extends RecyclerView.Adapter<Application> {
        public final boolean AEQbTJ;
        public final java.util.List<java.lang.String> KWHzl;
        public final int OLrzqt;
        public final C15489eKf copydefault;

        public TaskDescription(@NotNull java.util.List<java.lang.String> list, boolean z, int i, @NotNull C15489eKf c15489eKf) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(c15489eKf, "");
            this.KWHzl = list;
            this.AEQbTJ = z;
            this.OLrzqt = i;
            this.copydefault = c15489eKf;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Application onCreateViewHolder(@NotNull final android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            AbstractC16849erg abstractC16849ergOLrzqt = AbstractC16849erg.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC16849ergOLrzqt, "");
            abstractC16849ergOLrzqt.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.eKX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    eKU.TaskDescription.EZpvd(this.EZpvd, viewGroup, view);
                }
            });
            return new Application(abstractC16849ergOLrzqt);
        }

        public static final void EZpvd(TaskDescription taskDescription, android.view.ViewGroup viewGroup, android.view.View view) {
            TxRecord txRecordAuCTel = taskDescription.copydefault.AuCTel();
            if (txRecordAuCTel != null) {
                ActivityC10049bhC.ActionBar actionBar = ActivityC10049bhC.Companion;
                android.content.Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                java.lang.String txId = txRecordAuCTel.getTxId();
                java.lang.String txhash = txRecordAuCTel.getTxhash();
                java.lang.String uOpHash = txRecordAuCTel.getUOpHash();
                if (uOpHash == null) {
                    uOpHash = "";
                }
                actionBar.KWHzl(context, (1544 & 2) != 0 ? "" : txId, (1544 & 4) != 0 ? "" : txhash, (1544 & 8) != 0 ? "" : uOpHash, txRecordAuCTel.getAddress(), txRecordAuCTel.getWalletId(), txRecordAuCTel.getOrderId(), (1544 & 128) != 0 ? 0L : txRecordAuCTel.getCoinId(), txRecordAuCTel.getOrderType(), (1544 & 512) != 0 ? false : false, (1544 & 1024) != 0 ? "" : null);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Application application, int i) {
            Intrinsics.checkNotNullParameter(application, "");
            application.KWHzl(this.KWHzl.get(i), i == this.KWHzl.size() - 1 && this.AEQbTJ, this.OLrzqt);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.KWHzl.size();
        }
    }

    public static final class Application extends RecyclerView.ViewHolder {
        public final AbstractC16849erg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC16849erg EZpvd() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull AbstractC16849erg abstractC16849erg) {
            super(abstractC16849erg.getRoot());
            Intrinsics.checkNotNullParameter(abstractC16849erg, "");
            this.copydefault = abstractC16849erg;
        }

        public final void KWHzl(@NotNull java.lang.String str, boolean z, int i) {
            java.lang.String str2;
            Intrinsics.checkNotNullParameter(str, "");
            ViewGroup.LayoutParams layoutParams = this.copydefault.getRoot().getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
                str2 = "SVG:" + str;
            } else {
                str2 = str;
            }
            C5448Sc c5448ScAEQbTJ = AEQbTJ(str);
            Glide.KWHzl(this.copydefault.KWHzl).EZpvd(str2).OLrzqt((RX<?>) c5448ScAEQbTJ).AEQbTJ(xWD.Activity.AEQbTJ).copydefault(xWD.Activity.AEQbTJ).KWHzl(xWD.Activity.AEQbTJ).EZpvd(this.copydefault.KWHzl);
            Glide.AEQbTJ(this.copydefault.getRoot().getContext()).EZpvd().copydefault(str2).OLrzqt((RX<?>) c5448ScAEQbTJ).OLrzqt(new StateListAnimator(this.copydefault.AEQbTJ));
            if (z) {
                this.copydefault.OLrzqt.setVisibility(0);
                this.copydefault.EZpvd.setVisibility(0);
            } else {
                this.copydefault.OLrzqt.setVisibility(8);
                this.copydefault.EZpvd.setVisibility(8);
            }
        }

        public static final class StateListAnimator extends AbstractC5450Se<android.view.View, android.graphics.Bitmap> {
            @Override // o.InterfaceC5462Sq
            public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            }

            @Override // o.AbstractC5450Se
            public void OLrzqt(android.graphics.drawable.Drawable drawable) {
            }

            public StateListAnimator(android.widget.ImageView imageView) {
                super(imageView);
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
            @Override // o.InterfaceC5462Sq
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public void copydefault(android.graphics.Bitmap bitmap, InterfaceC5460So<? super android.graphics.Bitmap> interfaceC5460So) {
                Intrinsics.checkNotNullParameter(bitmap, "");
                yCQ.KWHzl(Application.this.EZpvd().getRoot().getContext()).EZpvd(30).AEQbTJ(8).KWHzl().AEQbTJ(bitmap).OLrzqt(Application.this.EZpvd().AEQbTJ);
            }
        }

        private final C5448Sc AEQbTJ(java.lang.String str) {
            C5448Sc c5448Sc;
            C5448Sc c5448ScCopydefault = new C5448Sc().AEQbTJ(DecodeFormat.PREFER_RGB_565).copydefault(AbstractC5360Os.copydefault);
            Intrinsics.checkNotNullExpressionValue(c5448ScCopydefault, "");
            C5448Sc c5448Sc2 = c5448ScCopydefault;
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
                if (C59449zhJ.startsWith$default("SVG:" + str, "SVG:", false, 2, null)) {
                    C5448Sc c5448ScAEQbTJ = c5448Sc2.copydefault(AbstractC5360Os.OLrzqt).AEQbTJ(DecodeFormat.PREFER_ARGB_8888);
                    Intrinsics.copydefault(c5448ScAEQbTJ);
                    c5448Sc = c5448ScAEQbTJ;
                } else {
                    C5448Sc c5448ScCopydefault2 = c5448Sc2.copydefault(AbstractC5360Os.EZpvd);
                    Intrinsics.copydefault(c5448ScCopydefault2);
                    c5448Sc = c5448ScCopydefault2;
                }
                return c5448Sc;
            }
            java.util.Locale locale2 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            java.lang.String lowerCase2 = str.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) ".gif", false, 2, (java.lang.Object) null) ? c5448Sc2.copydefault(AbstractC5360Os.OLrzqt) : c5448Sc2;
        }
    }
}
