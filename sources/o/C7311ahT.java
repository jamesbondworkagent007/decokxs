package o;

import android.view.View;
import o.C7343ahz;
import o.InterfaceC7297ahF;

/* JADX INFO: renamed from: o.ahT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7311ahT implements InterfaceC7297ahF {
    @Override // o.InterfaceC7297ahF
    public <T extends android.view.View & InterfaceC7297ahF.Application> T AEQbTJ(android.content.Context context) {
        return new Activity(context);
    }

    /* JADX INFO: renamed from: o.ahT$Activity */
    public static class Activity extends android.widget.LinearLayout implements InterfaceC7297ahF.Application {
        public C55173xeu AEQbTJ;

        public Activity(@androidx.annotation.NonNull android.content.Context context) {
            super(context);
            setOrientation(1);
            setGravity(17);
            this.AEQbTJ = (C55173xeu) android.view.LayoutInflater.from(getContext()).inflate(C7343ahz.Activity.zsXlph, (android.view.ViewGroup) this, true).findViewById(C7343ahz.TaskDescription.AYXKKw);
        }

        public void setTitle(java.lang.CharSequence charSequence) {
            this.AEQbTJ.setTitle(charSequence);
        }

        public void setRetry(java.lang.CharSequence charSequence) {
            this.AEQbTJ.setRetry(charSequence);
        }

        @Override // o.InterfaceC7297ahF.Application
        public void setRetryListener(View.OnClickListener onClickListener) {
            this.AEQbTJ.setRetryClickListener(onClickListener);
        }
    }
}
