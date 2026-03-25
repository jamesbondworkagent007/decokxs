package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C19439gCk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gCk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19439gCk extends RecyclerView {
    public Function1<? super AddressData, Unit> AEQbTJ;
    public java.lang.String EZpvd;
    public final java.util.ArrayList<java.lang.Object> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeadUrl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSelectAddressFinish(Function1<? super AddressData, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19439gCk(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new java.util.ArrayList<>();
        this.EZpvd = "";
        copydefault();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19439gCk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new java.util.ArrayList<>();
        this.EZpvd = "";
        copydefault();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19439gCk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new java.util.ArrayList<>();
        this.EZpvd = "";
        copydefault();
    }

    private final void copydefault() {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(AddressData.class, new StateListAnimator(C13754dXa.TaskDescription.DNMMPQ, dTV.OLrzqt));
        c59534zip.setItems(this.copydefault);
        setAdapter(c59534zip);
    }

    /* JADX INFO: renamed from: o.gCk$StateListAnimator */
    public static final class StateListAnimator extends C43318rmy<AddressData, AbstractC16491ekt> {
        public StateListAnimator(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC16491ekt> c43312rms, final AddressData addressData) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(addressData, "");
            Glide.AEQbTJ(((AbstractC16491ekt) c43312rms.OLrzqt()).getRoot().getContext()).EZpvd(C19439gCk.this.EZpvd).KWHzl(C52761wXj.TaskDescription.aHXSQp).copydefault(C52761wXj.TaskDescription.aHXSQp).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(((AbstractC16491ekt) c43312rms.OLrzqt()).getRoot().getContext())).EZpvd((android.widget.ImageView) ((AbstractC16491ekt) c43312rms.OLrzqt()).AEQbTJ);
            ((AbstractC16491ekt) c43312rms.OLrzqt()).getRoot().setSelected(addressData.isChecked());
            C55251xgS c55251xgS = ((AbstractC16491ekt) c43312rms.OLrzqt()).gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(addressData.isChecked() ? 0 : 8);
            android.view.View root = ((AbstractC16491ekt) c43312rms.OLrzqt()).getRoot();
            final C19439gCk c19439gCk = C19439gCk.this;
            root.setOnClickListener(new View.OnClickListener() { // from class: o.gCm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C19439gCk.StateListAnimator.OLrzqt(addressData, c19439gCk, view);
                }
            });
            super.onBindViewHolder((C43312rms) c43312rms, addressData);
        }

        public static final void OLrzqt(AddressData addressData, C19439gCk c19439gCk, android.view.View view) {
            if (addressData.isChecked() || !addressData.isSupported()) {
                return;
            }
            c19439gCk.copydefault(addressData);
            Function1 function1 = c19439gCk.AEQbTJ;
            if (function1 != null) {
                function1.invoke(addressData);
            }
        }
    }

    public final void copydefault(AddressData addressData) {
        java.lang.String address = addressData.getAddress();
        if (address == null || address.length() == 0) {
            return;
        }
        java.util.ArrayList<java.lang.Object> arrayList = this.copydefault;
        if (arrayList != null) {
            for (java.lang.Object obj : arrayList) {
                Intrinsics.copydefault(obj, "");
                AddressData addressData2 = (AddressData) obj;
                addressData2.setChecked(addressData2.getAddressType() == addressData.getAddressType());
            }
        }
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void setAddressDataList(@NotNull java.util.List<AddressData> list) {
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
