package o;

import android.view.View;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressWithMemo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.goP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20834goP extends AbstractC43310rmq<AddressWithMemo, AbstractC16902esg> {
    public final yHO<java.lang.Integer, java.lang.String, java.lang.Boolean, Unit> KWHzl;
    public final java.util.HashSet<java.lang.Integer> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C13754dXa.TaskDescription.RckOJh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return dTV.isConnected;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C20834goP(@NotNull yHO<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.Boolean, Unit> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.KWHzl = yho;
        this.OLrzqt = new java.util.HashSet<>();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    public C43312rms<AbstractC16902esg> onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C43312rms<AbstractC16902esg> c43312rmsOnCreateViewHolder = super.onCreateViewHolder(layoutInflater, viewGroup);
        ((AbstractC16902esg) c43312rmsOnCreateViewHolder.OLrzqt()).OLrzqt.EZpvd(false);
        Intrinsics.checkNotNullExpressionValue(c43312rmsOnCreateViewHolder, "");
        return c43312rmsOnCreateViewHolder;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC16902esg> c43312rms, @NotNull AddressWithMemo addressWithMemo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(addressWithMemo, "");
        super.onBindViewHolder((C43312rms) c43312rms, addressWithMemo);
        ((AbstractC16902esg) c43312rms.OLrzqt()).AEQbTJ.setText(addressWithMemo.getAddress());
        final C55008xbo c55008xbo = ((AbstractC16902esg) c43312rms.OLrzqt()).OLrzqt;
        java.lang.String memo = addressWithMemo.getMemo();
        Intrinsics.copydefault(c55008xbo);
        KWHzl(memo, c55008xbo, c43312rms.getBindingAdapterPosition());
        c55008xbo.setText(addressWithMemo.getMemo());
        android.widget.TextView textViewFJNWhG = c55008xbo.fJNWhG();
        if (textViewFJNWhG != null) {
            android.widget.TextView textViewFJNWhG2 = c55008xbo.fJNWhG();
            if (textViewFJNWhG2 == null || !textViewFJNWhG2.hasFocus()) {
                C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
                android.text.Editable text = c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null;
                int i = (text == null || text.length() == 0) ? 8 : 0;
                textViewFJNWhG.setVisibility(i);
            }
        }
        C55001xbh c55001xbhAkhnZx2 = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.goO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    C20834goP.AEQbTJ(c55008xbo, view, z);
                }
            });
        }
        C55001xbh c55001xbhAkhnZx3 = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            c55001xbhAkhnZx3.addTextChangedListener(new Application(c55008xbo, c43312rms));
        }
        C55001xbh c55001xbhAkhnZx4 = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx4 != null) {
            c55001xbhAkhnZx4.setFilters(new C57482yjJ[]{new C57482yjJ(251)});
        }
        if (addressWithMemo.isExchangeMemo()) {
            c55008xbo.setState(3);
            android.widget.TextView textView = ((AbstractC16902esg) c43312rms.OLrzqt()).KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            return;
        }
        android.widget.TextView textView2 = ((AbstractC16902esg) c43312rms.OLrzqt()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(C55008xbo c55008xbo, android.view.View view, boolean z) {
        int i;
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setHint(z ? "" : C33070mpX.AYXKKw(C13754dXa.FragmentManager.ReportDrawnKtReportDrawnWhenfullyDrawnReporter1));
        }
        android.widget.TextView textViewFJNWhG = c55008xbo.fJNWhG();
        if (textViewFJNWhG != null) {
            if (z) {
                i = 0;
            } else {
                C55001xbh c55001xbhAkhnZx2 = c55008xbo.AkhnZx();
                android.text.Editable text = c55001xbhAkhnZx2 != null ? c55001xbhAkhnZx2.getText() : null;
                if (text == null || text.length() == 0) {
                    i = 8;
                }
            }
            textViewFJNWhG.setVisibility(i);
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull C55008xbo c55008xbo, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c55008xbo, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        if (bytes.length > 250) {
            this.OLrzqt.add(java.lang.Integer.valueOf(i));
            c55008xbo.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose1));
        } else {
            this.OLrzqt.remove(java.lang.Integer.valueOf(i));
            c55008xbo.values();
        }
        this.KWHzl.invoke(java.lang.Integer.valueOf(i), str, java.lang.Boolean.valueOf(!this.OLrzqt.isEmpty()));
    }

    /* JADX INFO: renamed from: o.goP$Application */
    public static final class Application implements android.text.TextWatcher {
        public final /* synthetic */ C55008xbo KWHzl;
        public final /* synthetic */ C43312rms OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application(C55008xbo c55008xbo, C43312rms c43312rms) {
            this.KWHzl = c55008xbo;
            this.OLrzqt = c43312rms;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String string = editable != null ? editable.toString() : null;
            if (string == null) {
                string = "";
            }
            C20834goP c20834goP = C20834goP.this;
            Intrinsics.copydefault(this.KWHzl);
            c20834goP.KWHzl(string, this.KWHzl, this.OLrzqt.getBindingAdapterPosition());
        }
    }
}
