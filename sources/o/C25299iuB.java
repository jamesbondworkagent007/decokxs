package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.dexui.main.swap.widget.mev.simple.MevInfoParam;
import com.okinc.business.dexui.main.swap.widget.mev.simple.MevSimpleParam;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iuB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25299iuB extends android.widget.LinearLayout {
    public InterfaceC25348iuy AEQbTJ;
    public hFT KWHzl;
    public MevSimpleParam OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListener(InterfaceC25348iuy interfaceC25348iuy) {
        this.AEQbTJ = interfaceC25348iuy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25299iuB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25299iuB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25299iuB(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final C55239xgG EZpvd() {
        hFT hft = this.KWHzl;
        if (hft != null) {
            return hft.KWHzl;
        }
        return null;
    }

    public final AppCompatTextView copydefault() {
        hFT hft = this.KWHzl;
        if (hft != null) {
            return hft.EZpvd;
        }
        return null;
    }

    public final void setData(@NotNull MevSimpleParam mevSimpleParam) {
        Intrinsics.checkNotNullParameter(mevSimpleParam, "");
        this.OLrzqt = mevSimpleParam;
        setVisibility(mevSimpleParam.OLrzqt() ? 0 : 8);
        hFT hft = this.KWHzl;
        if (hft != null) {
            hft.KWHzl.setChecked(mevSimpleParam.EZpvd());
            AppCompatTextView appCompatTextView = hft.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(mevSimpleParam.EZpvd() ^ true ? 0 : 8);
            MevInfoParam mevInfoParamCopydefault = mevSimpleParam.copydefault();
            if (mevInfoParamCopydefault != null) {
                hft.AEQbTJ.setData(mevInfoParamCopydefault);
            }
        }
    }

    public static /* synthetic */ void setListener$default(C25299iuB c25299iuB, InterfaceC25348iuy interfaceC25348iuy, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC25348iuy = null;
        }
        c25299iuB.setListener(interfaceC25348iuy);
    }

    public final void KWHzl() {
        this.KWHzl = hFT.AEQbTJ(android.view.LayoutInflater.from(getContext()), this, true);
        AEQbTJ();
    }

    public final void AEQbTJ() {
        final hFT hft = this.KWHzl;
        if (hft != null) {
            C55320xhi c55320xhi = hft.copydefault;
            c55320xhi.setOnClickListener(new TaskDescription(c55320xhi, 1000L, this));
            hft.KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.iuz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C25299iuB.AEQbTJ(this.KWHzl, hft, compoundButton, z);
                }
            });
        }
    }

    public static final void AEQbTJ(C25299iuB c25299iuB, hFT hft, android.widget.CompoundButton compoundButton, boolean z) {
        MevInfoParam mevInfoParamCopydefault;
        InterfaceC25348iuy interfaceC25348iuy = c25299iuB.AEQbTJ;
        if (interfaceC25348iuy != null) {
            interfaceC25348iuy.KWHzl(z);
        }
        MevSimpleParam mevSimpleParam = c25299iuB.OLrzqt;
        if (mevSimpleParam == null || (mevInfoParamCopydefault = mevSimpleParam.copydefault()) == null) {
            return;
        }
        mevInfoParamCopydefault.EZpvd(z);
        hft.AEQbTJ.setData(mevInfoParamCopydefault);
    }

    /* JADX INFO: renamed from: o.iuB$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C25299iuB EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C25299iuB c25299iuB) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c25299iuB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                InterfaceC25348iuy interfaceC25348iuy = this.EZpvd.AEQbTJ;
                if (interfaceC25348iuy != null) {
                    interfaceC25348iuy.copydefault();
                }
            }
        }
    }
}
