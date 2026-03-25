package o;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: o.avm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8070avm<GPlayResult, TGlobalSplitResult> implements InterfaceC8081avx<TGlobalSplitResult> {
    public final InterfaceC8074avq<GPlayResult, TGlobalSplitResult> AEQbTJ;
    public final Task<GPlayResult> EZpvd;

    public C8070avm(Task<GPlayResult> task) {
        this(task, new InterfaceC8074avq<GPlayResult, TGlobalSplitResult>() { // from class: o.avm.4
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: GPlayResult */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.InterfaceC8074avq
            public TGlobalSplitResult copydefault(GPlayResult gplayresult) {
                return gplayresult;
            }
        });
    }

    public C8070avm(Task<GPlayResult> task, InterfaceC8074avq<GPlayResult, TGlobalSplitResult> interfaceC8074avq) {
        this.EZpvd = task;
        this.AEQbTJ = interfaceC8074avq;
    }

    @Override // o.InterfaceC8081avx
    public boolean EZpvd() {
        return this.EZpvd.isSuccessful();
    }

    @Override // o.InterfaceC8081avx
    public TGlobalSplitResult AEQbTJ() {
        return (TGlobalSplitResult) this.AEQbTJ.copydefault(this.EZpvd.getResult());
    }

    @Override // o.InterfaceC8081avx
    public InterfaceC8081avx<TGlobalSplitResult> copydefault(final InterfaceC8034avC<TGlobalSplitResult> interfaceC8034avC) {
        this.EZpvd.addOnSuccessListener((OnSuccessListener<? super GPlayResult>) new OnSuccessListener<GPlayResult>() { // from class: o.avm.1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(GPlayResult gplayresult) {
                interfaceC8034avC.AEQbTJ(C8070avm.this.AEQbTJ.copydefault(gplayresult));
            }
        });
        return this;
    }

    @Override // o.InterfaceC8081avx
    public InterfaceC8081avx<TGlobalSplitResult> copydefault(final InterfaceC8032avA interfaceC8032avA) {
        this.EZpvd.addOnFailureListener(new OnFailureListener() { // from class: o.avm.2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public void onFailure(java.lang.Exception exc) {
                interfaceC8032avA.AEQbTJ(C8068avk.EZpvd(exc));
            }
        });
        return this;
    }

    @Override // o.InterfaceC8081avx
    public InterfaceC8081avx<TGlobalSplitResult> EZpvd(final InterfaceC8080avw<TGlobalSplitResult> interfaceC8080avw) {
        this.EZpvd.addOnCompleteListener(new OnCompleteListener<GPlayResult>() { // from class: o.avm.3
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task<GPlayResult> task) {
                interfaceC8080avw.KWHzl(C8070avm.this);
            }
        });
        return this;
    }
}
