package o;

import com.immomo.mls.log.ErrorType;

/* JADX INFO: renamed from: o.agY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7263agY extends java.io.PrintStream implements InterfaceC7851ard {
    public java.io.PrintStream AEQbTJ;

    public C7263agY(java.io.PrintStream printStream) {
        super(new java.io.FileOutputStream(java.io.FileDescriptor.out));
        this.AEQbTJ = printStream;
    }

    @Override // java.io.PrintStream
    public void print(java.lang.String str) {
        java.io.PrintStream printStream = this.AEQbTJ;
        if (printStream != null) {
            printStream.print(str);
        }
        C7324ahg.copydefault(str);
    }

    @Override // java.io.PrintStream
    public void println() {
        java.io.PrintStream printStream = this.AEQbTJ;
        if (printStream != null) {
            printStream.println();
        }
    }

    @Override // o.InterfaceC7851ard
    public void OLrzqt(java.lang.String str) {
        java.lang.Appendable appendable = this.AEQbTJ;
        if (appendable instanceof InterfaceC7851ard) {
            ((InterfaceC7851ard) appendable).OLrzqt(str);
        }
        C7324ahg.AEQbTJ(str);
    }

    @Override // o.InterfaceC7851ard
    public void AEQbTJ(java.lang.String str, ErrorType errorType) {
        java.lang.Appendable appendable = this.AEQbTJ;
        if (appendable instanceof InterfaceC7851ard) {
            ((InterfaceC7851ard) appendable).AEQbTJ(str, errorType);
        }
        C7324ahg.AEQbTJ(str);
    }
}
