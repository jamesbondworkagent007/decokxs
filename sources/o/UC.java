package o;

/* JADX INFO: loaded from: classes21.dex */
public final class UC extends java.io.Writer {
    public final C5544Vu KWHzl;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public UC(C5536Vm c5536Vm) {
        this.KWHzl = new C5544Vu(c5536Vm);
    }

    /* JADX DEBUG: Method merged with bridge method: append(C)Ljava/lang/Appendable; */
    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(char c) {
        write(c);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: append(Ljava/lang/CharSequence;)Ljava/lang/Appendable; */
    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence charSequence) {
        java.lang.String string = charSequence.toString();
        this.KWHzl.EZpvd(string, 0, string.length());
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable; */
    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence charSequence, int i, int i2) {
        java.lang.String string = charSequence.subSequence(i, i2).toString();
        this.KWHzl.EZpvd(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.KWHzl.OLrzqt(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        this.KWHzl.OLrzqt(cArr, i, i2);
    }

    @Override // java.io.Writer
    public void write(int i) {
        this.KWHzl.KWHzl((char) i);
    }

    @Override // java.io.Writer
    public void write(java.lang.String str) {
        this.KWHzl.EZpvd(str, 0, str.length());
    }

    @Override // java.io.Writer
    public void write(java.lang.String str, int i, int i2) {
        this.KWHzl.EZpvd(str, i, i2);
    }

    public java.lang.String OLrzqt() {
        java.lang.String strCopydefault = this.KWHzl.copydefault();
        this.KWHzl.fetchVPNInfo();
        return strCopydefault;
    }
}
