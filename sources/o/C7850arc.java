package o;

import com.immomo.mls.log.ErrorType;

/* JADX INFO: renamed from: o.arc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7850arc extends java.io.PrintStream implements InterfaceC7851ard {
    public final InterfaceC7854arg AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC7854arg AEQbTJ() {
        return this.AEQbTJ;
    }

    public C7850arc(@androidx.annotation.NonNull InterfaceC7854arg interfaceC7854arg) {
        super(new java.io.FileOutputStream(java.io.FileDescriptor.out));
        this.AEQbTJ = interfaceC7854arg;
    }

    @Override // java.io.PrintStream
    public void print(final java.lang.String str) {
        if (C7840arS.KWHzl()) {
            this.AEQbTJ.EZpvd(str);
        } else {
            C7840arS.copydefault(new java.lang.Runnable() { // from class: o.arc.4
                @Override // java.lang.Runnable
                public void run() {
                    C7850arc.this.AEQbTJ.EZpvd(str);
                }
            });
        }
    }

    @Override // java.io.PrintStream
    public void println() {
        if (C7840arS.KWHzl()) {
            this.AEQbTJ.KWHzl();
        } else {
            C7840arS.copydefault(new java.lang.Runnable() { // from class: o.arc.5
                @Override // java.lang.Runnable
                public void run() {
                    C7850arc.this.AEQbTJ.KWHzl();
                }
            });
        }
    }

    @Override // o.InterfaceC7851ard
    public void OLrzqt(final java.lang.String str) {
        if (C7840arS.KWHzl()) {
            this.AEQbTJ.KWHzl(str);
        } else {
            C7840arS.copydefault(new java.lang.Runnable() { // from class: o.arc.3
                @Override // java.lang.Runnable
                public void run() {
                    C7850arc.this.AEQbTJ.KWHzl(str);
                }
            });
        }
    }

    @Override // o.InterfaceC7851ard
    public void AEQbTJ(final java.lang.String str, final ErrorType errorType) {
        if (C7840arS.KWHzl()) {
            this.AEQbTJ.OLrzqt(str, errorType);
        } else {
            C7840arS.copydefault(new java.lang.Runnable() { // from class: o.arc.2
                @Override // java.lang.Runnable
                public void run() {
                    C7850arc.this.AEQbTJ.OLrzqt(str, errorType);
                }
            });
        }
    }
}
