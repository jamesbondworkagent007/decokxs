package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.transfer.segwit.AddressAggregationData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C21229gvn;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gvn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21229gvn extends RecyclerView {
    public androidx.fragment.app.FragmentManager AEQbTJ;
    public Function1<? super AddressAggregationData, Unit> KWHzl;
    public final java.util.ArrayList<AddressAggregationData> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFragmentManager(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.AEQbTJ = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSelectAddressFinish(Function1<? super AddressAggregationData, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21229gvn(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new java.util.ArrayList<>();
        KWHzl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21229gvn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new java.util.ArrayList<>();
        KWHzl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21229gvn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new java.util.ArrayList<>();
        KWHzl();
    }

    private final void KWHzl() {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(AddressAggregationData.class, new TaskDescription(C13754dXa.TaskDescription.OTwTPd, dTV.OLrzqt));
        c59534zip.setItems(this.copydefault);
        setAdapter(c59534zip);
    }

    /* JADX INFO: renamed from: o.gvn$TaskDescription */
    public static final class TaskDescription extends C43318rmy<AddressAggregationData, AbstractC16497ekz> {
        public TaskDescription(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC16497ekz> c43312rms, final AddressAggregationData addressAggregationData) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(addressAggregationData, "");
            super.onBindViewHolder((C43312rms) c43312rms, addressAggregationData);
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(addressAggregationData.getCoinId()));
            boolean zIsAddressEmpty = addressAggregationData.isAddressEmpty();
            java.lang.String displayAmount = addressAggregationData.getDisplayAmount();
            C13821dZn c13821dZn = C13821dZn.EZpvd;
            java.lang.String strOLrzqt = c13821dZn.OLrzqt(displayAmount);
            java.lang.String strOLrzqt2 = c13821dZn.OLrzqt(addressAggregationData.getDisplayCurrencyAmount());
            if (c10854bwMKWHzl == null || !c10854bwMKWHzl.dxcTrN()) {
                addressAggregationData.getTokenType();
            } else {
                C10854bwM c10854bwMKWHzl2 = c10854bwMKWHzl.KWHzl();
                if (c10854bwMKWHzl2 != null) {
                    c10854bwMKWHzl2.fJNWhG();
                }
            }
            ((AbstractC16497ekz) c43312rms.OLrzqt()).AkhnZx.setText(strOLrzqt);
            ((AbstractC16497ekz) c43312rms.OLrzqt()).isConnected.setText(strOLrzqt2);
            android.widget.ImageView imageView = ((AbstractC16497ekz) c43312rms.OLrzqt()).AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            java.lang.String imageUrl = addressAggregationData.getImageUrl();
            int i = C52761wXj.TaskDescription.aHXSQp;
            C33054mpH.KWHzl(imageView, imageUrl, i, i);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) addressAggregationData.getAddress())) {
                ((AbstractC16497ekz) c43312rms.OLrzqt()).KWHzl.setVisibility(0);
                ((AbstractC16497ekz) c43312rms.OLrzqt()).EZpvd.setVisibility(0);
                ((AbstractC16497ekz) c43312rms.OLrzqt()).OLrzqt.setVisibility(8);
                ((AbstractC16497ekz) c43312rms.OLrzqt()).AYXKKw.setVisibility(8);
                if (addressAggregationData.isSupported()) {
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).AkhnZx.setVisibility(strOLrzqt.length() == 0 ? 8 : 0);
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).isConnected.setVisibility(strOLrzqt2.length() == 0 ? 8 : 0);
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).copydefault.setVisibility(addressAggregationData.getShowRightArrow() ? 0 : 8);
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).KWHzl.setText(addressAggregationData.getAddressTypeStr());
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).EZpvd.setText(C14079deg.getAddressStr$default(C14079deg.EZpvd, addressAggregationData.getAddress(), false, 2, null));
                } else {
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).AkhnZx.setVisibility(8);
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).isConnected.setVisibility(8);
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).copydefault.setVisibility(8);
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).AYXKKw.setVisibility(0);
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).KWHzl.setText(addressAggregationData.getAddressTypeStr());
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).EZpvd.setText(addressAggregationData.getAddressTipsContent());
                }
            } else {
                ((AbstractC16497ekz) c43312rms.OLrzqt()).OLrzqt.setVisibility(0);
                ((AbstractC16497ekz) c43312rms.OLrzqt()).AYXKKw.setVisibility(8);
                ((AbstractC16497ekz) c43312rms.OLrzqt()).KWHzl.setVisibility(0);
                ((AbstractC16497ekz) c43312rms.OLrzqt()).KWHzl.setText(java.lang.String.valueOf(addressAggregationData.getAddressTypeStr()));
                ((AbstractC16497ekz) c43312rms.OLrzqt()).AkhnZx.setVisibility(8);
                ((AbstractC16497ekz) c43312rms.OLrzqt()).isConnected.setVisibility(8);
                ((AbstractC16497ekz) c43312rms.OLrzqt()).copydefault.setVisibility(8);
                if (addressAggregationData.isSupported()) {
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).EZpvd.setVisibility(8);
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).OLrzqt.setVisibility(0);
                } else {
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).EZpvd.setVisibility(0);
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).EZpvd.setText(addressAggregationData.getAddressTipsContent());
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).AYXKKw.setVisibility(0);
                    ((AbstractC16497ekz) c43312rms.OLrzqt()).OLrzqt.setVisibility(8);
                }
            }
            addressAggregationData.setChosenGenerateButton(zIsAddressEmpty);
            android.view.View view = ((AbstractC16497ekz) c43312rms.OLrzqt()).DbNXlk;
            final C21229gvn c21229gvn = C21229gvn.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.gvm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C21229gvn.TaskDescription.AEQbTJ(c21229gvn, addressAggregationData, view2);
                }
            });
            C52794wYp c52794wYp = ((AbstractC16497ekz) c43312rms.OLrzqt()).OLrzqt;
            final C21229gvn c21229gvn2 = C21229gvn.this;
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.gvj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C21229gvn.TaskDescription.EZpvd(c21229gvn2, addressAggregationData, view2);
                }
            });
        }

        public static final void AEQbTJ(C21229gvn c21229gvn, AddressAggregationData addressAggregationData, android.view.View view) {
            Function1 function1 = c21229gvn.KWHzl;
            if (function1 != null) {
                function1.invoke(addressAggregationData);
            }
        }

        public static final void EZpvd(C21229gvn c21229gvn, AddressAggregationData addressAggregationData, android.view.View view) {
            Function1 function1 = c21229gvn.KWHzl;
            if (function1 != null) {
                function1.invoke(addressAggregationData);
            }
        }
    }

    public final void setAddressDataList(@NotNull java.util.List<AddressAggregationData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        setHasFixedSize(true);
        setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.copydefault.clear();
        this.copydefault.addAll(list);
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
