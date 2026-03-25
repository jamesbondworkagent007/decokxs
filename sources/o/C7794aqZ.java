package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.log.ErrorType;

/* JADX INFO: renamed from: o.aqZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7794aqZ extends RecyclerView implements InterfaceC7854arg {
    public static int KWHzl = 100;
    public int AEQbTJ;
    public int EZpvd;
    public TaskDescription OLrzqt;
    public ActionBar[] copydefault;

    public C7794aqZ(android.content.Context context) {
        super(context);
        this.AEQbTJ = KWHzl;
        this.EZpvd = 0;
        setItemAnimator(null);
        this.copydefault = new ActionBar[this.AEQbTJ];
        this.OLrzqt = new TaskDescription();
        setLayoutManager(new LinearLayoutManager(context));
        setAdapter(this.OLrzqt);
        setLayoutParams(new ViewGroup.LayoutParams(C7857arj.djBIcL(context) / 2, C7857arj.AhwBna(context) / 3));
        setBackgroundColor(-1723579324);
    }

    @Override // o.InterfaceC7854arg
    public void EZpvd(java.lang.String str) {
        OLrzqt(str);
    }

    @Override // o.InterfaceC7854arg
    public void KWHzl() {
        OLrzqt();
    }

    @Override // o.InterfaceC7854arg
    public void KWHzl(java.lang.String str) {
        int i = this.EZpvd;
        if (i <= 1) {
            copydefault(str);
            return;
        }
        ActionBar actionBar = this.copydefault[i - 2];
        if (actionBar.EZpvd == ErrorType.LOG) {
            copydefault(str);
            return;
        }
        if (str.equals(actionBar.OLrzqt()) && actionBar.EZpvd == ErrorType.ERROR_REPEAT) {
            actionBar.copydefault++;
            this.OLrzqt.notifyItemChanged(this.EZpvd - 2);
        } else {
            if (str.equals(actionBar.OLrzqt())) {
                ActionBar actionBarAEQbTJ = AEQbTJ();
                actionBarAEQbTJ.EZpvd = ErrorType.ERROR_REPEAT;
                actionBarAEQbTJ.AEQbTJ = this.copydefault[this.EZpvd - 2].AEQbTJ;
                actionBarAEQbTJ.copydefault = 1;
                this.OLrzqt.notifyItemChanged(this.EZpvd - 1);
                OLrzqt();
                return;
            }
            copydefault(str);
        }
    }

    @Override // o.InterfaceC7854arg
    public void OLrzqt(java.lang.String str, ErrorType errorType) {
        int i = this.EZpvd;
        if (i <= 1) {
            EZpvd(str, errorType);
            return;
        }
        ActionBar actionBar = this.copydefault[i - 2];
        if (actionBar.EZpvd == ErrorType.LOG) {
            EZpvd(str, errorType);
            return;
        }
        ErrorType errorType2 = ErrorType.ERROR;
        if (errorType == errorType2 && actionBar.EZpvd == ErrorType.ERROR_REPEAT && str.equals(actionBar.OLrzqt())) {
            actionBar.copydefault++;
            this.OLrzqt.notifyItemChanged(this.EZpvd - 2);
            return;
        }
        if (errorType == errorType2 && actionBar.EZpvd == errorType2 && str.equals(actionBar.OLrzqt())) {
            ActionBar actionBarAEQbTJ = AEQbTJ();
            actionBarAEQbTJ.EZpvd = ErrorType.ERROR_REPEAT;
            actionBarAEQbTJ.AEQbTJ = this.copydefault[this.EZpvd - 2].AEQbTJ;
            actionBarAEQbTJ.copydefault = 1;
            this.OLrzqt.notifyItemChanged(this.EZpvd - 1);
            OLrzqt();
            return;
        }
        ErrorType errorType3 = ErrorType.WARNING;
        if (errorType == errorType3 && actionBar.EZpvd == ErrorType.WARNING_REPEAT && str.equals(actionBar.OLrzqt())) {
            actionBar.copydefault++;
            this.OLrzqt.notifyItemChanged(this.EZpvd - 2);
            return;
        }
        if (errorType == errorType3 && actionBar.EZpvd == errorType3 && str.equals(actionBar.OLrzqt())) {
            ActionBar actionBarAEQbTJ2 = AEQbTJ();
            actionBarAEQbTJ2.EZpvd = ErrorType.WARNING_REPEAT;
            actionBarAEQbTJ2.AEQbTJ = this.copydefault[this.EZpvd - 2].AEQbTJ;
            actionBarAEQbTJ2.copydefault = 1;
            this.OLrzqt.notifyItemChanged(this.EZpvd - 1);
            OLrzqt();
            return;
        }
        EZpvd(str, errorType);
    }

    public void copydefault() {
        java.util.Arrays.fill(this.copydefault, (java.lang.Object) null);
        this.EZpvd = 0;
        this.OLrzqt.notifyDataSetChanged();
    }

    public final void copydefault(java.lang.String str) {
        ActionBar actionBarAEQbTJ = AEQbTJ();
        actionBarAEQbTJ.EZpvd = ErrorType.ERROR;
        actionBarAEQbTJ.AEQbTJ(str);
        this.OLrzqt.notifyItemChanged(this.EZpvd - 1);
        OLrzqt();
    }

    public final void EZpvd(java.lang.String str, ErrorType errorType) {
        ActionBar actionBarAEQbTJ = AEQbTJ();
        actionBarAEQbTJ.EZpvd = errorType;
        actionBarAEQbTJ.AEQbTJ(str);
        this.OLrzqt.notifyItemChanged(this.EZpvd - 1);
        OLrzqt();
    }

    private ActionBar AEQbTJ() {
        if (this.EZpvd == 0) {
            this.EZpvd = 1;
        }
        ActionBar actionBar = this.copydefault[this.EZpvd - 1];
        if (actionBar != null) {
            return actionBar;
        }
        ActionBar actionBar2 = new ActionBar();
        this.copydefault[this.EZpvd - 1] = actionBar2;
        return actionBar2;
    }

    public final void OLrzqt(java.lang.String str) {
        AEQbTJ().AEQbTJ(str);
        this.OLrzqt.notifyItemChanged(this.EZpvd - 1);
        scrollToPosition(this.EZpvd - 1);
    }

    public final void OLrzqt() {
        int i = this.EZpvd;
        int i2 = i + 1;
        this.EZpvd = i2;
        int i3 = this.AEQbTJ;
        if (i2 > i3) {
            ActionBar[] actionBarArr = new ActionBar[i3];
            int i4 = (i3 >> 1) - 1;
            int i5 = (i3 - i4) - 1;
            this.EZpvd = i5;
            java.lang.System.arraycopy(this.copydefault, i4, actionBarArr, 0, i5);
            this.copydefault = actionBarArr;
            actionBarArr[this.EZpvd] = new ActionBar();
            this.OLrzqt.notifyDataSetChanged();
            scrollToPosition(this.EZpvd - 1);
            return;
        }
        this.copydefault[i] = new ActionBar();
        this.OLrzqt.notifyItemInserted(this.EZpvd - 1);
        scrollToPosition(this.EZpvd - 1);
    }

    public void setMaxLines(int i) {
        if (this.AEQbTJ != i) {
            this.AEQbTJ = i;
            this.copydefault = new ActionBar[i];
            this.OLrzqt.notifyDataSetChanged();
            this.EZpvd = 0;
        }
    }

    /* JADX INFO: renamed from: o.aqZ$TaskDescription */
    public final class TaskDescription extends RecyclerView.Adapter<StateListAnimator> {
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
            android.widget.TextView textView = new android.widget.TextView(viewGroup.getContext());
            textView.setTextColor(-1);
            textView.setTextSize(14.0f);
            textView.setPaddingRelative(5, 5, 5, 5);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new StateListAnimator(textView);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(StateListAnimator stateListAnimator, int i) {
            ActionBar actionBar = C7794aqZ.this.copydefault[i];
            stateListAnimator.AEQbTJ.setTextColor(actionBar.EZpvd.getErrorColor());
            stateListAnimator.AEQbTJ.setText(actionBar.toString());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return C7794aqZ.this.EZpvd;
        }
    }

    /* JADX INFO: renamed from: o.aqZ$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public android.widget.TextView AEQbTJ;

        public StateListAnimator(android.view.View view) {
            super(view);
            this.AEQbTJ = (android.widget.TextView) view;
        }
    }

    /* JADX INFO: renamed from: o.aqZ$ActionBar */
    public static final class ActionBar {
        public java.lang.StringBuilder AEQbTJ;
        public ErrorType EZpvd;
        public int copydefault;

        private ActionBar() {
            this.EZpvd = ErrorType.LOG;
        }

        public java.lang.String toString() {
            ErrorType errorType = this.EZpvd;
            if (errorType == ErrorType.ERROR_REPEAT) {
                return "⚠️same error as before, count: " + this.copydefault;
            }
            if (errorType == ErrorType.WARNING_REPEAT) {
                return "⚠️same error as before, count: " + this.copydefault;
            }
            return OLrzqt();
        }

        public final java.lang.String OLrzqt() {
            java.lang.StringBuilder sb = this.AEQbTJ;
            return sb != null ? sb.toString() : "";
        }

        public void AEQbTJ(java.lang.String str) {
            if (this.AEQbTJ == null) {
                this.AEQbTJ = new java.lang.StringBuilder();
            }
            this.AEQbTJ.append(str);
        }
    }
}
