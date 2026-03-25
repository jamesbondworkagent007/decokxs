package o;

/* JADX INFO: renamed from: o.avh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8065avh extends AbstractC8005auZ<AbstractC8060avc> {
    public final android.widget.TextView EZpvd;

    public C8065avh(android.widget.TextView textView) {
        this.EZpvd = textView;
    }

    @Override // o.AbstractC8005auZ
    public void AEQbTJ(InterfaceC58256yxp<? super AbstractC8060avc> interfaceC58256yxp) {
        ActionBar actionBar = new ActionBar(this.EZpvd, interfaceC58256yxp);
        interfaceC58256yxp.onSubscribe(actionBar);
        this.EZpvd.addTextChangedListener(actionBar);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
    @Override // o.AbstractC8005auZ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public AbstractC8060avc OLrzqt() {
        android.widget.TextView textView = this.EZpvd;
        return AbstractC8060avc.KWHzl(textView, textView.getEditableText());
    }

    /* JADX INFO: renamed from: o.avh$ActionBar */
    public static final class ActionBar extends AbstractC58265yxy implements android.text.TextWatcher {
        public final android.widget.TextView EZpvd;
        public final InterfaceC58256yxp<? super AbstractC8060avc> KWHzl;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar(android.widget.TextView textView, InterfaceC58256yxp<? super AbstractC8060avc> interfaceC58256yxp) {
            this.EZpvd = textView;
            this.KWHzl = interfaceC58256yxp;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            this.KWHzl.onNext(AbstractC8060avc.KWHzl(this.EZpvd, editable));
        }

        @Override // o.AbstractC58265yxy
        public void OLrzqt() {
            this.EZpvd.removeTextChangedListener(this);
        }
    }
}
