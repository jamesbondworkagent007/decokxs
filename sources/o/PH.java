package o;

import com.bumptech.glide.Priority;
import o.InterfaceC5386Ps;
import o.NU;

/* JADX INFO: loaded from: classes2.dex */
public class PH<Model> implements InterfaceC5386Ps<Model, Model> {
    public static final PH<?> copydefault = new PH<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static <T> PH<T> AEQbTJ() {
        return (PH<T>) copydefault;
    }

    @Override // o.InterfaceC5386Ps
    public boolean OLrzqt(@androidx.annotation.NonNull Model model) {
        return true;
    }

    @java.lang.Deprecated
    public PH() {
    }

    @Override // o.InterfaceC5386Ps
    public InterfaceC5386Ps.Application<Model> AEQbTJ(@androidx.annotation.NonNull Model model, int i, int i2, @androidx.annotation.NonNull NM nm) {
        return new InterfaceC5386Ps.Application<>(new C5465St(model), new StateListAnimator(model));
    }

    public static class StateListAnimator<Model> implements NU<Model> {
        public final Model EZpvd;

        @Override // o.NU
        public void AEQbTJ() {
        }

        @Override // o.NU
        public void copydefault() {
        }

        public StateListAnimator(Model model) {
            this.EZpvd = model;
        }

        @Override // o.NU
        public void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull NU.TaskDescription<? super Model> taskDescription) {
            taskDescription.KWHzl(this.EZpvd);
        }

        @Override // o.NU
        public java.lang.Class<Model> KWHzl() {
            return (java.lang.Class<Model>) this.EZpvd.getClass();
        }

        @Override // o.NU
        public com.bumptech.glide.load.DataSource OLrzqt() {
            return com.bumptech.glide.load.DataSource.LOCAL;
        }
    }

    public static class ActionBar<Model> implements InterfaceC5390Pw<Model, Model> {
        public static final ActionBar<?> KWHzl = new ActionBar<>();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static <T> ActionBar<T> copydefault() {
            return (ActionBar<T>) KWHzl;
        }

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        @java.lang.Deprecated
        public ActionBar() {
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<Model, Model> AEQbTJ(PA pa) {
            return PH.AEQbTJ();
        }
    }
}
