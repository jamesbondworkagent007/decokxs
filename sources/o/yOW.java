package o;

import java.util.Collections;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yOW extends AbstractC56722yPx {
    public final C56935yXu AkhnZx;
    public final InterfaceC59182zcH<InterfaceC56679yOh> DbNXlk;
    public final InterfaceC59182zcH<InterfaceC59098zad> isConnected;
    public final InterfaceC59182zcH<AbstractC59242zdO> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void EZpvd(int i) {
        java.lang.String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX DEBUG: Method merged with bridge method: bS_()Lo/yNs; */
    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    @Override // o.AbstractC56722yPx, o.InterfaceC56665yNu
    /* JADX INFO: renamed from: zuBGHE */
    public InterfaceC56658yNn bT_() {
        return this;
    }

    public yOW(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull C56935yXu c56935yXu) {
        if (interfaceC59187zcM == null) {
            EZpvd(0);
        }
        if (c56935yXu == null) {
            EZpvd(1);
        }
        this.AkhnZx = c56935yXu;
        this.values = interfaceC59187zcM.KWHzl(new Function0<AbstractC59242zdO>() { // from class: o.yOW.4
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public AbstractC59242zdO invoke() {
                yOW yow = yOW.this;
                return C59322zep.OLrzqt(yow, yow.ORxRYg(), new Function1<AbstractC59287zeG, AbstractC59242zdO>() { // from class: o.yOW.4.3
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public AbstractC59242zdO invoke(AbstractC59287zeG abstractC59287zeG) {
                        InterfaceC56663yNs interfaceC56663yNsAEQbTJ = abstractC59287zeG.AEQbTJ(yOW.this);
                        if (interfaceC56663yNsAEQbTJ == null) {
                            return yOW.this.values.invoke();
                        }
                        if (interfaceC56663yNsAEQbTJ instanceof InterfaceC56690yOs) {
                            return C59231zdD.KWHzl((InterfaceC56690yOs) interfaceC56663yNsAEQbTJ, C59322zep.OLrzqt(interfaceC56663yNsAEQbTJ.fJNWhG().copydefault()));
                        }
                        if (interfaceC56663yNsAEQbTJ instanceof AbstractC56722yPx) {
                            return C59322zep.AEQbTJ(interfaceC56663yNsAEQbTJ.fJNWhG().AEQbTJ(abstractC59287zeG), ((AbstractC56722yPx) interfaceC56663yNsAEQbTJ).AEQbTJ(abstractC59287zeG), this);
                        }
                        return interfaceC56663yNsAEQbTJ.bQ_();
                    }
                });
            }
        });
        this.isConnected = interfaceC59187zcM.KWHzl(new Function0<InterfaceC59098zad>() { // from class: o.yOW.1
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public InterfaceC59098zad invoke() {
                return new C59096zab(yOW.this.ORxRYg());
            }
        });
        this.DbNXlk = interfaceC59187zcM.KWHzl(new Function0<InterfaceC56679yOh>() { // from class: o.yOW.5
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public InterfaceC56679yOh invoke() {
                return new C56717yPs(yOW.this);
            }
        });
    }

    @Override // o.yNQ
    public C56935yXu bR_() {
        C56935yXu c56935yXu = this.AkhnZx;
        if (c56935yXu == null) {
            EZpvd(2);
        }
        return c56935yXu;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC59098zad OcIXYQ() {
        InterfaceC59098zad interfaceC59098zadInvoke = this.isConnected.invoke();
        if (interfaceC59098zadInvoke == null) {
            EZpvd(4);
        }
        return interfaceC59098zadInvoke;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC56679yOh DTwDnp() {
        InterfaceC56679yOh interfaceC56679yOhInvoke = this.DbNXlk.invoke();
        if (interfaceC56679yOhInvoke == null) {
            EZpvd(5);
        }
        return interfaceC56679yOhInvoke;
    }

    @Override // o.InterfaceC56658yNn
    public java.util.List<InterfaceC56679yOh> AxsJAY() {
        java.util.List<InterfaceC56679yOh> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            EZpvd(6);
        }
        return listEmptyList;
    }

    @Override // o.AbstractC56722yPx
    public InterfaceC59098zad KWHzl(@NotNull AbstractC59325zes abstractC59325zes, @NotNull AbstractC59287zeG abstractC59287zeG) {
        if (abstractC59325zes == null) {
            EZpvd(10);
        }
        if (abstractC59287zeG == null) {
            EZpvd(11);
        }
        if (!abstractC59325zes.EZpvd()) {
            return new C59107zam(AEQbTJ(abstractC59287zeG), TypeSubstitutor.EZpvd(abstractC59325zes));
        }
        InterfaceC59098zad interfaceC59098zadAEQbTJ = AEQbTJ(abstractC59287zeG);
        if (interfaceC59098zadAEQbTJ == null) {
            EZpvd(12);
        }
        return interfaceC59098zadAEQbTJ;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC59098zad copydefault(@NotNull AbstractC59325zes abstractC59325zes) {
        if (abstractC59325zes == null) {
            EZpvd(15);
        }
        InterfaceC59098zad interfaceC59098zadKWHzl = KWHzl(abstractC59325zes, yZE.OLrzqt(yYH.OLrzqt(this)));
        if (interfaceC59098zadKWHzl == null) {
            EZpvd(16);
        }
        return interfaceC59098zadKWHzl;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC59098zad ORxRYg() {
        InterfaceC59098zad interfaceC59098zadAEQbTJ = AEQbTJ(yZE.OLrzqt(yYH.OLrzqt(this)));
        if (interfaceC59098zadAEQbTJ == null) {
            EZpvd(17);
        }
        return interfaceC59098zadAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yNv; */
    @Override // o.InterfaceC56688yOq
    public InterfaceC56658yNn KWHzl(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            EZpvd(18);
        }
        return typeSubstitutor.EZpvd() ? this : new C56719yPu(this, typeSubstitutor);
    }

    @Override // o.InterfaceC56658yNn, o.InterfaceC56663yNs
    public AbstractC59242zdO bQ_() {
        AbstractC59242zdO abstractC59242zdOInvoke = this.values.invoke();
        if (abstractC59242zdOInvoke == null) {
            EZpvd(20);
        }
        return abstractC59242zdOInvoke;
    }

    @Override // o.InterfaceC56665yNu
    public <R, D> R AEQbTJ(InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
        return interfaceC56667yNw.EZpvd(this, d);
    }
}
