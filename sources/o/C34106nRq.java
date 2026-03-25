package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.im.imui.relationlist.model.GroupType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nRq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34106nRq extends AbstractC52787wYi {
    public final Function1<GroupType, Unit> EZpvd;
    public final boolean KWHzl;
    public GroupType copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.im.imui.relationlist.model.GroupType, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C34106nRq(@NotNull Function1<? super GroupType, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
        this.copydefault = GroupType.STANDARD;
        this.KWHzl = true;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(6);
        wxq.setTitle(C33070mpX.AYXKKw(C35399nuc.LoaderManager.OWSZPf));
    }

    @Override // o.AbstractC52787wYi, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        copydefault();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.fIwbmz));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this));
        }
    }

    public final void copydefault() {
        C55251xgS c55251xgS;
        android.content.Context context = getContext();
        if (context != null) {
            c55251xgS = new C55251xgS(context, null, 0, 6, null);
            c55251xgS.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.fGsPTM));
            c55251xgS.setOKDSSize(-5);
            c55251xgS.setOKDSStyle(7);
        } else {
            c55251xgS = null;
        }
        OLrzqt(yDY.gEmmrt(new C55167xeo(-1, C33070mpX.AYXKKw(C35399nuc.LoaderManager.OmYuqg) + " ", C33070mpX.AYXKKw(C35399nuc.LoaderManager.isTimeProfileEmpty), c55251xgS, 0, 16, null), new C55167xeo(-1, C33070mpX.AYXKKw(C35399nuc.LoaderManager.QjzqRB), C33070mpX.AYXKKw(C35399nuc.LoaderManager.OeawrHRnVkix), null, 0, 24, null)));
        OLrzqt(new Function2() { // from class: o.nRo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C34106nRq.AEQbTJ(this.KWHzl, ((java.lang.Integer) obj).intValue(), (C55167xeo) obj2);
            }
        });
        KWHzl(1);
    }

    public static final Unit AEQbTJ(C34106nRq c34106nRq, int i, C55167xeo c55167xeo) {
        GroupType groupType;
        if (i == 0) {
            groupType = GroupType.PREMIUM;
        } else {
            groupType = GroupType.STANDARD;
        }
        c34106nRq.copydefault = groupType;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.nRq$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C34106nRq AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C34106nRq c34106nRq) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c34106nRq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd.invoke(this.AEQbTJ.copydefault);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
