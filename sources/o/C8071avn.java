package o;

import android.content.IntentSender;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;

/* JADX INFO: renamed from: o.avn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8071avn implements InterfaceC8075avr {
    public final SplitInstallManager AEQbTJ;
    public final java.util.Map<InterfaceC8083avz, SplitInstallStateUpdatedListener> OLrzqt = new java.util.HashMap();

    public C8071avn(SplitInstallManager splitInstallManager) {
        this.AEQbTJ = splitInstallManager;
    }

    @Override // o.InterfaceC8075avr
    public void AEQbTJ(final InterfaceC8083avz interfaceC8083avz) {
        SplitInstallStateUpdatedListener splitInstallStateUpdatedListener = new SplitInstallStateUpdatedListener() { // from class: o.avn.5
            /* JADX DEBUG: Method merged with bridge method: onStateUpdate(Ljava/lang/Object;)V */
            @Override // com.google.android.play.core.listener.StateUpdatedListener
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public void onStateUpdate(SplitInstallSessionState splitInstallSessionState) {
                interfaceC8083avz.KWHzl(C8073avp.copydefault(splitInstallSessionState));
            }
        };
        this.OLrzqt.put(interfaceC8083avz, splitInstallStateUpdatedListener);
        this.AEQbTJ.registerListener(splitInstallStateUpdatedListener);
    }

    @Override // o.InterfaceC8075avr
    public void KWHzl(InterfaceC8083avz interfaceC8083avz) {
        SplitInstallStateUpdatedListener splitInstallStateUpdatedListener = this.OLrzqt.get(interfaceC8083avz);
        if (splitInstallStateUpdatedListener != null) {
            this.AEQbTJ.unregisterListener(splitInstallStateUpdatedListener);
            this.OLrzqt.remove(interfaceC8083avz);
        }
    }

    @Override // o.InterfaceC8075avr
    public boolean EZpvd(InterfaceC8076avs interfaceC8076avs, android.app.Activity activity, int i) throws IntentSender.SendIntentException {
        return this.AEQbTJ.startConfirmationDialogForResult(C8073avp.AEQbTJ(interfaceC8076avs), activity, i);
    }

    @Override // o.InterfaceC8075avr
    public InterfaceC8081avx<java.lang.Integer> EZpvd(C8077avt c8077avt) {
        return new C8070avm(this.AEQbTJ.startInstall(C8072avo.EZpvd(c8077avt)));
    }

    @Override // o.InterfaceC8075avr
    public InterfaceC8081avx<java.lang.Void> copydefault(int i) {
        return new C8070avm(this.AEQbTJ.cancelInstall(i));
    }

    @Override // o.InterfaceC8075avr
    public InterfaceC8081avx<java.util.List<InterfaceC8076avs>> OLrzqt() {
        return new C8070avm(this.AEQbTJ.getSessionStates(), new InterfaceC8074avq<java.util.List<SplitInstallSessionState>, java.util.List<InterfaceC8076avs>>() { // from class: o.avn.4
            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // o.InterfaceC8074avq
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public java.util.List<InterfaceC8076avs> copydefault(java.util.List<SplitInstallSessionState> list) {
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                java.util.Iterator<SplitInstallSessionState> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C8073avp.copydefault(it.next()));
                }
                return arrayList;
            }
        });
    }

    @Override // o.InterfaceC8075avr
    public java.util.Set<java.lang.String> KWHzl() {
        return this.AEQbTJ.getInstalledModules();
    }
}
