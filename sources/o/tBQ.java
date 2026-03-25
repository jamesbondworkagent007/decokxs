package o;

import android.view.View;
import com.okinc.planet.biz_plugin.AllCryptoOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tBQ extends AbstractC43310rmq<AllCryptoOption, AbstractC46309tPo> {
    public final Function0<Unit> EZpvd;
    public final Function0<java.lang.Boolean> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.fXHmeK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C47499trJ.KWHzl;
    }

    public tBQ(@NotNull Function0<Unit> function0, @NotNull Function0<java.lang.Boolean> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.EZpvd = function0;
        this.KWHzl = function02;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC46309tPo> c43312rms, @NotNull AllCryptoOption allCryptoOption) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(allCryptoOption, "");
        super.onBindViewHolder((C43312rms) c43312rms, allCryptoOption);
        AbstractC46309tPo abstractC46309tPo = (AbstractC46309tPo) c43312rms.OLrzqt();
        abstractC46309tPo.OLrzqt.setImageResource(C47501trL.ActionBar.ejfBZ);
        abstractC46309tPo.KWHzl.setText(allCryptoOption.getTitle());
        abstractC46309tPo.AEQbTJ.setVisibility(this.KWHzl.invoke().booleanValue() ? 0 : 8);
        android.view.View root = abstractC46309tPo.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this));
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ tBQ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, tBQ tbq) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = tbq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.EZpvd.invoke();
            }
        }
    }
}
