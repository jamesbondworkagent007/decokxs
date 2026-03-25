package o;

/* JADX INFO: renamed from: o.avl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8069avl extends AbstractC8005auZ<AbstractC8066avi> {
    public final android.widget.TextView EZpvd;

    public C8069avl(android.widget.TextView textView) {
        this.EZpvd = textView;
    }

    @Override // o.AbstractC8005auZ
    public void AEQbTJ(InterfaceC58256yxp<? super AbstractC8066avi> interfaceC58256yxp) {
        TaskDescription taskDescription = new TaskDescription(this.EZpvd, interfaceC58256yxp);
        interfaceC58256yxp.onSubscribe(taskDescription);
        this.EZpvd.addTextChangedListener(taskDescription);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
    @Override // o.AbstractC8005auZ
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public AbstractC8066avi OLrzqt() {
        android.widget.TextView textView = this.EZpvd;
        return AbstractC8066avi.OLrzqt(textView, textView.getText(), 0, 0, 0);
    }

    /* JADX INFO: renamed from: o.avl$TaskDescription */
    public static final class TaskDescription extends AbstractC58265yxy implements android.text.TextWatcher {
        public final android.widget.TextView AEQbTJ;
        public final InterfaceC58256yxp<? super AbstractC8066avi> EZpvd;

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription(android.widget.TextView textView, InterfaceC58256yxp<? super AbstractC8066avi> interfaceC58256yxp) {
            this.AEQbTJ = textView;
            this.EZpvd = interfaceC58256yxp;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            if (isDisposed()) {
                return;
            }
            this.EZpvd.onNext(AbstractC8066avi.OLrzqt(this.AEQbTJ, charSequence, i, i2, i3));
        }

        @Override // o.AbstractC58265yxy
        public void OLrzqt() {
            this.AEQbTJ.removeTextChangedListener(this);
        }
    }
}
