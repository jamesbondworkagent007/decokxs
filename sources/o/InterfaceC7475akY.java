package o;

import com.immomo.mls.fun.ud.view.UDScrollView;

/* JADX INFO: renamed from: o.akY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7475akY<U extends UDScrollView> extends InterfaceC7384ain<U> {

    /* JADX INFO: renamed from: o.akY$ActionBar */
    public interface ActionBar {
        void values();
    }

    /* JADX INFO: renamed from: o.akY$StateListAnimator */
    public interface StateListAnimator {
        void AuCTel();

        void gEmmrt();
    }

    /* JADX INFO: renamed from: o.akY$TaskDescription */
    public interface TaskDescription {
        void AhwBna();

        void DbNXlk();

        void isConnected();
    }

    C7348aiD AEQbTJ();

    android.view.ViewGroup AYXKKw();

    C7350aiF EZpvd();

    android.view.ViewGroup djBIcL();

    void setBouncesEnabled(boolean z);

    void setContentOffset(C7348aiD c7348aiD);

    void setContentSize(C7350aiF c7350aiF);

    void setFlingListener(ActionBar actionBar);

    void setFlingSpeed(float f);

    void setHorizontalScrollBarEnabled(boolean z);

    void setOffsetWithAnim(C7348aiD c7348aiD);

    void setOffsetWithAnim(C7348aiD c7348aiD, int i);

    void setOnScrollListener(TaskDescription taskDescription);

    void setScrollEnable(boolean z);

    void setTouchActionListener(StateListAnimator stateListAnimator);

    void setVerticalScrollBarEnabled(boolean z);
}
