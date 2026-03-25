package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import o.InterfaceC56897yWj;
import o.InterfaceC59090zaV;
import o.InterfaceC59151zbd;
import o.yOU;
import o.yOV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yVP {
    public static final Activity KWHzl = new Activity(null);
    public final C59083zaO AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59083zaO KWHzl() {
        return this.AEQbTJ;
    }

    public yVP(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull yNP ynp, @NotNull InterfaceC59090zaV interfaceC59090zaV, @NotNull yVR yvr, @NotNull yVI yvi, @NotNull C56798ySs c56798ySs, @NotNull yNO yno, @NotNull InterfaceC59148zba interfaceC59148zba, @NotNull yQR yqr, @NotNull InterfaceC59084zaP interfaceC59084zaP, @NotNull InterfaceC59291zeK interfaceC59291zeK, @NotNull C59369zfj c59369zfj) {
        yOV yovOLrzqt;
        yOU youOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(ynp, "");
        Intrinsics.checkNotNullParameter(interfaceC59090zaV, "");
        Intrinsics.checkNotNullParameter(yvr, "");
        Intrinsics.checkNotNullParameter(yvi, "");
        Intrinsics.checkNotNullParameter(c56798ySs, "");
        Intrinsics.checkNotNullParameter(yno, "");
        Intrinsics.checkNotNullParameter(interfaceC59148zba, "");
        Intrinsics.checkNotNullParameter(yqr, "");
        Intrinsics.checkNotNullParameter(interfaceC59084zaP, "");
        Intrinsics.checkNotNullParameter(interfaceC59291zeK, "");
        Intrinsics.checkNotNullParameter(c59369zfj, "");
        AbstractC56640yMw abstractC56640yMwAEQbTJ = ynp.AEQbTJ();
        JvmBuiltIns jvmBuiltIns = abstractC56640yMwAEQbTJ instanceof JvmBuiltIns ? (JvmBuiltIns) abstractC56640yMwAEQbTJ : null;
        this.AEQbTJ = new C59083zaO(interfaceC59187zcM, ynp, interfaceC59090zaV, yvr, yvi, c56798ySs, InterfaceC59151zbd.Application.EZpvd, interfaceC59148zba, yqr, yVT.OLrzqt, yDY.AhwBna(), yno, interfaceC59084zaP, (jvmBuiltIns == null || (youOLrzqt = jvmBuiltIns.OLrzqt()) == null) ? yOU.Application.EZpvd : youOLrzqt, (jvmBuiltIns == null || (yovOLrzqt = jvmBuiltIns.OLrzqt()) == null) ? yOV.TaskDescription.AEQbTJ : yovOLrzqt, C56928yXn.AEQbTJ.OLrzqt(), interfaceC59291zeK, new yZV(interfaceC59187zcM, yDY.AhwBna()), c59369zfj.copydefault(), C59152zbe.AEQbTJ);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yVP.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static final class TaskDescription {
            public final yVO AEQbTJ;
            public final yVP copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final yVO AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final yVP KWHzl() {
                return this.copydefault;
            }

            public TaskDescription(@NotNull yVP yvp, @NotNull yVO yvo) {
                Intrinsics.checkNotNullParameter(yvp, "");
                Intrinsics.checkNotNullParameter(yvo, "");
                this.copydefault = yvp;
                this.AEQbTJ = yvo;
            }
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.yVN.makeLazyJavaPackageFragmentProvider$default(o.yRl, o.yNP, o.zcM, o.yNO, o.yWa, o.yVO, o.zba, o.yTH, o.ySu, o.yWj, int, java.lang.Object):o.ySs */
        public final TaskDescription EZpvd(@NotNull InterfaceC56888yWa interfaceC56888yWa, @NotNull InterfaceC56888yWa interfaceC56888yWa2, @NotNull InterfaceC56764yRl interfaceC56764yRl, @NotNull java.lang.String str, @NotNull InterfaceC59148zba interfaceC59148zba, @NotNull yTH yth) {
            Intrinsics.checkNotNullParameter(interfaceC56888yWa, "");
            Intrinsics.checkNotNullParameter(interfaceC56888yWa2, "");
            Intrinsics.checkNotNullParameter(interfaceC56764yRl, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(interfaceC59148zba, "");
            Intrinsics.checkNotNullParameter(yth, "");
            LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("DeserializationComponentsForJava.ModuleData");
            JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager, JvmBuiltIns.Kind.FROM_DEPENDENCIES);
            C56935yXu c56935yXuCopydefault = C56935yXu.copydefault('<' + str + '>');
            Intrinsics.checkNotNullExpressionValue(c56935yXuCopydefault, "");
            yPA ypa = new yPA(c56935yXuCopydefault, lockBasedStorageManager, jvmBuiltIns, null, null, null, 56, null);
            jvmBuiltIns.KWHzl(ypa);
            jvmBuiltIns.AEQbTJ((yNP) ypa, true);
            yVO yvo = new yVO();
            C56799ySt c56799ySt = new C56799ySt();
            yNO yno = new yNO(lockBasedStorageManager, ypa);
            C56798ySs c56798ySsOLrzqt = yVN.OLrzqt(interfaceC56764yRl, ypa, lockBasedStorageManager, yno, interfaceC56888yWa, yvo, interfaceC59148zba, yth, c56799ySt, (512 & 512) != 0 ? InterfaceC56897yWj.Activity.AEQbTJ : null);
            yVP yvpCopydefault = yVN.copydefault(ypa, lockBasedStorageManager, yno, c56798ySsOLrzqt, interfaceC56888yWa, yvo, interfaceC59148zba, C56921yXg.KWHzl);
            yvo.EZpvd(yvpCopydefault);
            yRX yrx = yRX.KWHzl;
            Intrinsics.checkNotNullExpressionValue(yrx, "");
            yZP yzp = new yZP(c56798ySsOLrzqt, yrx);
            c56799ySt.KWHzl(yzp);
            C56649yNe c56649yNe = new C56649yNe(lockBasedStorageManager, interfaceC56888yWa2, ypa, yno, jvmBuiltIns.OLrzqt(), jvmBuiltIns.OLrzqt(), InterfaceC59090zaV.StateListAnimator.EZpvd, InterfaceC59291zeK.AEQbTJ.OLrzqt(), new yZV(lockBasedStorageManager, yDY.AhwBna()));
            ypa.copydefault(ypa);
            ypa.KWHzl(new C56705yPg(yDY.gEmmrt(yzp.copydefault(), c56649yNe), "CompositeProvider@RuntimeModuleData for " + ypa));
            return new TaskDescription(yvpCopydefault, yvo);
        }
    }
}
