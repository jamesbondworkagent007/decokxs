package o;

import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.widget.asset_card.AssetCardData;
import com.okinc.business.market.widget.asset_card.DexAssetContentBlock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kLt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28015kLt extends androidx.recyclerview.widget.ListAdapter<AssetCardData, StateListAnimator> {
    public static final Application copydefault = new Application(null);

    public C28015kLt() {
        super(copydefault);
    }

    /* JADX INFO: renamed from: o.kLt$Application */
    public static final class Application extends DiffUtil.ItemCallback<AssetCardData> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kLt.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull AssetCardData assetCardData, @NotNull AssetCardData assetCardData2) {
            Intrinsics.checkNotNullParameter(assetCardData, "");
            Intrinsics.checkNotNullParameter(assetCardData2, "");
            return assetCardData.copydefault().containsAll(assetCardData2.copydefault());
        }

        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull AssetCardData assetCardData, @NotNull AssetCardData assetCardData2) {
            Intrinsics.checkNotNullParameter(assetCardData, "");
            Intrinsics.checkNotNullParameter(assetCardData2, "");
            return Intrinsics.EZpvd(assetCardData, assetCardData2);
        }
    }

    /* JADX INFO: renamed from: o.kLt$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final /* synthetic */ C28015kLt AEQbTJ;
        public final C23396hxT KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C28015kLt c28015kLt, C23396hxT c23396hxT) {
            super(c23396hxT.getRoot());
            Intrinsics.checkNotNullParameter(c23396hxT, "");
            this.AEQbTJ = c28015kLt;
            this.KWHzl = c23396hxT;
        }

        public final void EZpvd(@NotNull AssetCardData assetCardData) {
            Intrinsics.checkNotNullParameter(assetCardData, "");
            LinearLayoutCompat linearLayoutCompat = this.KWHzl.KWHzl;
            linearLayoutCompat.removeAllViews();
            int i = 0;
            for (java.lang.Object obj : assetCardData.copydefault()) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                DexAssetContentBlock dexAssetContentBlock = (DexAssetContentBlock) obj;
                float f = i == yDY.AuCTel(assetCardData.copydefault()) ? 0.0f : i == 0 ? 8.0f : 4.0f;
                android.content.Context context = linearLayoutCompat.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                android.view.View viewEZpvd = EZpvd(context, dexAssetContentBlock);
                android.content.Context context2 = linearLayoutCompat.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                viewEZpvd.setPadding(0, 0, 0, C55298xhM.copydefault(f, context2));
                linearLayoutCompat.addView(viewEZpvd);
                i++;
            }
        }

        public final android.view.View EZpvd(android.content.Context context, DexAssetContentBlock dexAssetContentBlock) {
            if (dexAssetContentBlock instanceof DexAssetContentBlock.Text) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                DexAssetContentBlock.Text text = (DexAssetContentBlock.Text) dexAssetContentBlock;
                appCompatTextView.setText(text.KWHzl());
                appCompatTextView.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -2));
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setSingleLine(true);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView.setGravity(8388611);
                C25352ivB.AEQbTJ(appCompatTextView, text.OLrzqt());
                C31258lqd.setTextColorOrDisabledColor$default(appCompatTextView, text.EZpvd(), 0, 2, null);
                return appCompatTextView;
            }
            if (dexAssetContentBlock instanceof DexAssetContentBlock.Trade) {
                C28013kLr c28013kLr = new C28013kLr(context, null, 0, 6, null);
                c28013kLr.setData((DexAssetContentBlock.Trade) dexAssetContentBlock);
                return c28013kLr;
            }
            if (!(dexAssetContentBlock instanceof DexAssetContentBlock.ProgressBar)) {
                throw new NoWhenBranchMatchedException();
            }
            C28016kLu c28016kLu = new C28016kLu(context, null, 0, 6, null);
            c28016kLu.setData((DexAssetContentBlock.ProgressBar) dexAssetContentBlock);
            return c28016kLu;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C23396hxT c23396hxTAEQbTJ = C23396hxT.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c23396hxTAEQbTJ, "");
        return new StateListAnimator(this, c23396hxTAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        AssetCardData item = getItem(i);
        Intrinsics.copydefault(item);
        stateListAnimator.EZpvd(item);
    }
}
