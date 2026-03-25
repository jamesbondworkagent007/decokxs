package o;

import kotlin.jvm.internal.Intrinsics;
import o.C2808Aa;
import o.InterfaceC2861Ab;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2967Ad implements InterfaceC2861Ab {
    public final C2808Aa KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lo/Ah; */
    @Override // o.InterfaceC2861Ab
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C2808Aa AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC2861Ab
    public java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public C2967Ad(@NotNull C2808Aa.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.OLrzqt = C52643wT.OLrzqt.OLrzqt();
        this.KWHzl = new C2808Aa(taskDescription);
    }

    @Override // o.InterfaceC2861Ab
    public InterfaceC5045Cp KWHzl(@NotNull InterfaceC5053Cx interfaceC5053Cx) {
        return InterfaceC2861Ab.ActionBar.OLrzqt(this, interfaceC5053Cx);
    }

    public C2967Ad(@NotNull InterfaceC55285xh interfaceC55285xh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC55285xh, "");
        C2808Aa.TaskDescription taskDescription = new C2808Aa.TaskDescription();
        taskDescription.copydefault(interfaceC55285xh);
        taskDescription.AEQbTJ(str);
        this(taskDescription);
    }
}
