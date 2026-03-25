package o;

import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C14140dfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gJl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19629gJl extends AbstractC33073mpa {
    public final MutableLiveData<AbstractC12782ctV> OLrzqt = new MutableLiveData<>();
    public final MutableLiveData<AbstractC12782ctV> copydefault = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<AbstractC12782ctV> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<AbstractC12782ctV> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gJl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createHDWallet$default(C19629gJl c19629gJl, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        c19629gJl.EZpvd(str, fragmentManager, i, function1);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager, int i, Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        call().AEQbTJ(C14140dfo.createHDWallet$default(C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null), str, i, fragmentManager, null, function1, new Function1() { // from class: o.gJo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19629gJl.EZpvd(this.copydefault, (AbstractC12782ctV) obj);
            }
        }, 8, null));
    }

    public static final Unit EZpvd(C19629gJl c19629gJl, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            c19629gJl.OLrzqt.setValue(abstractC12782ctV);
        } else {
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaController), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }
}
