package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes4.dex */
public final class cZH extends AbstractC43215rlA implements InterfaceC9851bdQ {
    public final LiveData<java.lang.Boolean> AEQbTJ = new MutableLiveData(java.lang.Boolean.FALSE);
    public MutableLiveData<java.lang.Integer> KWHzl;
    public MutableLiveData<java.lang.Boolean> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9851bdQ
    public void AEQbTJ(MutableLiveData<java.lang.Integer> mutableLiveData) {
        this.KWHzl = mutableLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9851bdQ
    public MutableLiveData<java.lang.Boolean> AkhnZx() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9851bdQ
    public LiveData<java.lang.Boolean> DbNXlk() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9851bdQ
    public void KWHzl(MutableLiveData<java.lang.Boolean> mutableLiveData) {
        this.OLrzqt = mutableLiveData;
    }

    @Override // o.InterfaceC9851bdQ
    public boolean fetchVPNInfo() {
        return C13912dbY.copydefault.djBIcL();
    }
}
