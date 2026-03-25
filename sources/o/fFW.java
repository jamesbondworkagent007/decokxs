package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletShareBean;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.CheckShareRequestBody;
import com.okinc.business.defi.biz.net.bean.CheckShareResponse;
import com.okinc.business.defi.biz.net.bean.CreateMpcResponse;
import com.okinc.business.defi.biz.net.bean.HandshakeResponse;
import com.okinc.business.defi.biz.net.bean.SyncShareRequestBody;
import com.okinc.business.defi.biz.net.bean.SyncShareResponse;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C12827cuN;
import o.C13754dXa;
import o.InterfaceC14334djW;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class fFW {
    public final C13934dbu copydefault = new C13934dbu();
    public final AbstractC14702dqT OLrzqt = C14703dqU.Companion.KWHzl();
    public int AEQbTJ = 1;

    public final void EZpvd(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, final int i, int i2, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = i2;
        InterfaceC14334djW interfaceC14334djWOLrzqt = C14392dkb.AEQbTJ.OLrzqt(abstractActivityC33041mov, i2);
        if (interfaceC14334djWOLrzqt != null) {
            InterfaceC14334djW.Application.judgeCloudServerStatus$default(interfaceC14334djWOLrzqt, abstractActivityC33041mov, 0, new Function0() { // from class: o.fGa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return fFW.copydefault(abstractActivityC33041mov, function0, this, i, str, str2, str3, str4, str5, function1);
                }
            }, 2, null);
        }
    }

    public static final Unit copydefault(AbstractActivityC33041mov abstractActivityC33041mov, Function0 function0, fFW ffw, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, Function1 function1) {
        abstractActivityC33041mov.dismissLoading();
        function0.invoke();
        ffw.EZpvd(abstractActivityC33041mov, i, str, str2, str3, str4, str5, function1);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final AbstractActivityC33041mov abstractActivityC33041mov, final int i, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final Function1<? super AbstractC12782ctV, Unit> function1) {
        if (!this.OLrzqt.isAdded()) {
            AbstractC14702dqT abstractC14702dqT = this.OLrzqt;
            androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            abstractC14702dqT.show(supportFragmentManager, C14703dqU.class.getSimpleName());
            this.OLrzqt.OLrzqt(C33069mpW.copydefault(C13754dXa.FragmentManager.Nullable, C56423yEv.EZpvd(C56390yDp.OLrzqt("acctname", dZP.OLrzqt.AhwBna()))));
        }
        xXX xxx = xXX.EZpvd;
        final java.lang.String strKWHzl = xxx.KWHzl();
        final java.lang.String strKWHzl2 = xxx.KWHzl(strKWHzl);
        dZP dzp = dZP.OLrzqt;
        final java.lang.String strEZpvd = dzp.EZpvd();
        final java.lang.String strOLrzqt = dzp.OLrzqt();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = "";
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = "";
        final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        objectRef4.element = "";
        AbstractC58185ywX abstractC58185ywXOLrzqt = C43423rox.OLrzqt(EZpvd(str, str2), new Function1() { // from class: o.fGF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(fFW.AEQbTJ(this.copydefault, (ResponseData) obj));
            }
        });
        final Function1 function12 = new Function1() { // from class: o.fGh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fFW.KWHzl(this.EZpvd, strEZpvd, strOLrzqt, strKWHzl2, (CheckShareResponse) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.fGk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fFW.getFieldNames(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.fGg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fFW.KWHzl(objectRef, str2, str3, strKWHzl, this, str, strKWHzl2, (HandshakeResponse) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.fGl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fFW.wlaJM(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.fGm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fFW.KWHzl(this.copydefault, str, strKWHzl2, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl(new InterfaceC58229yxO() { // from class: o.fGp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fFW.isConnected(function14, obj);
            }
        });
        final Function1 function15 = new Function1() { // from class: o.fGn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fFW.copydefault(objectRef2, this, str, strKWHzl2, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl4 = abstractC58185ywXKWHzl3.KWHzl(new InterfaceC58229yxO() { // from class: o.fGo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fFW.fIwbmz(function15, obj);
            }
        });
        final C17477fGu c17477fGu = new C17477fGu(strEZpvd);
        AbstractC58185ywX abstractC58185ywXKWHzl5 = abstractC58185ywXKWHzl4.KWHzl(new InterfaceC58229yxO() { // from class: o.fGI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fFW.ejfBZ(c17477fGu, obj);
            }
        });
        final Function1 function16 = new Function1() { // from class: o.fGJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fFW.OLrzqt(objectRef3, str, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl6 = abstractC58185ywXKWHzl5.KWHzl(new InterfaceC58229yxO() { // from class: o.fGG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fFW.fARcdN(function16, obj);
            }
        });
        final Function1 function17 = new Function1() { // from class: o.fGK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fFW.copydefault(objectRef2, objectRef4, objectRef, strEZpvd, strOLrzqt, abstractActivityC33041mov, this, str4, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl7 = abstractC58185ywXKWHzl6.KWHzl(new InterfaceC58229yxO() { // from class: o.fFY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fFW.fJNWhG(function17, obj);
            }
        });
        final Function1 function18 = new Function1() { // from class: o.fGf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fFW.KWHzl(objectRef, str, this, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl8 = abstractC58185ywXKWHzl7.KWHzl(new InterfaceC58229yxO() { // from class: o.fGb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fFW.getNewProxyInstance(function18, obj);
            }
        });
        final Function1 function19 = new Function1() { // from class: o.fGc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fFW.EZpvd(abstractActivityC33041mov, str5, objectRef4, objectRef, objectRef3, i, this, function1, (SyncShareResponse) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fGd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fFW.iwGUEr(function19, obj);
            }
        };
        final Function1 function110 = new Function1() { // from class: o.fGe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fFW.copydefault(this.OLrzqt, abstractActivityC33041mov, i, str, str2, str3, str4, str5, function1, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl8.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fGj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fFW.hDKMBd(function110, obj);
            }
        });
        if (abstractActivityC33041mov instanceof ActivityC17523fIm) {
            ((ActivityC17523fIm) abstractActivityC33041mov).OLrzqt().AEQbTJ(interfaceC58217yxCAEQbTJ);
        } else {
            abstractActivityC33041mov.addDisposable(interfaceC58217yxCAEQbTJ);
        }
    }

    public static final InterfaceC60096zvd getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(fFW ffw, java.lang.String str, java.lang.String str2, java.lang.String str3, CheckShareResponse checkShareResponse) {
        Intrinsics.checkNotNullParameter(checkShareResponse, "");
        return C43423rox.OLrzqt(ffw.KWHzl("", str, str2, str3), new Function1() { // from class: o.fGB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(fFW.djBIcL((ResponseData) obj));
            }
        });
    }

    public static final InterfaceC60096zvd wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: o.xYQ */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final InterfaceC60096zvd KWHzl(final Ref.ObjectRef objectRef, java.lang.String str, java.lang.String str2, java.lang.String str3, fFW ffw, java.lang.String str4, java.lang.String str5, HandshakeResponse handshakeResponse) {
        Intrinsics.checkNotNullParameter(handshakeResponse, "");
        ?? mpcId = handshakeResponse.getMpcId();
        objectRef.element = mpcId;
        xYQ xyq = xYQ.KWHzl;
        xyq.copydefault(0, mpcId, null, str, str2, 3, str3);
        AbstractC58185ywX abstractC58185ywXOLrzqt = C43423rox.OLrzqt(ffw.AEQbTJ((java.lang.String) objectRef.element, str4, str5, xyq.copydefault(1, null, null, null, null, 3, null), 1), new Function1() { // from class: o.fGC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(fFW.AYXKKw((ResponseData) obj));
            }
        });
        final Function1 function1 = new Function1() { // from class: o.fGA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fFW.KWHzl(objectRef, (CreateMpcResponse) obj);
            }
        };
        return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fGE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fFW.uzCIH(function1, obj);
            }
        });
    }

    public static final kotlin.Pair uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(Ref.ObjectRef objectRef, CreateMpcResponse createMpcResponse) {
        Intrinsics.checkNotNullParameter(createMpcResponse, "");
        return C56390yDp.OLrzqt(objectRef.element, createMpcResponse);
    }

    public static final InterfaceC60096zvd isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(fFW ffw, java.lang.String str, java.lang.String str2, final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C43423rox.OLrzqt(ffw.AEQbTJ((java.lang.String) pair.getFirst(), str, str2, xYQ.KWHzl.copydefault(2, null, ((CreateMpcResponse) pair.getSecond()).getData(), null, null, 3, null), 2), new Function1() { // from class: o.fGr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(fFW.valueOf((ResponseData) obj));
            }
        });
        final Function1 function1 = new Function1() { // from class: o.fGy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fFW.KWHzl(pair, (CreateMpcResponse) obj);
            }
        };
        return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fGz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fFW.AkhnZx(function1, obj);
            }
        });
    }

    public static final kotlin.Pair AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(kotlin.Pair pair, CreateMpcResponse createMpcResponse) {
        Intrinsics.checkNotNullParameter(createMpcResponse, "");
        return C56390yDp.OLrzqt(pair.getFirst(), createMpcResponse);
    }

    public static final InterfaceC60096zvd fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
    public static final InterfaceC60096zvd copydefault(Ref.ObjectRef objectRef, fFW ffw, java.lang.String str, java.lang.String str2, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        objectRef.element = xYQ.KWHzl.copydefault(3, null, ((CreateMpcResponse) pair.getSecond()).getData(), null, null, 3, null);
        return C43423rox.OLrzqt(ffw.AEQbTJ((java.lang.String) pair.getFirst(), str, str2, "", 3), new Function1() { // from class: o.fGD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(fFW.AhwBna((ResponseData) obj));
            }
        });
    }

    public static final InterfaceC60096zvd ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final kotlin.Pair AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(java.lang.String str, final CreateMpcResponse createMpcResponse) {
        Intrinsics.checkNotNullParameter(createMpcResponse, "");
        AbstractC58185ywX<java.util.List<AbstractC12782ctV>> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AYXKKw(str).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.fGq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fFW.EZpvd(createMpcResponse, (java.util.List) obj);
            }
        };
        return abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fGt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fFW.AuCTel(function1, obj);
            }
        });
    }

    public static final kotlin.Pair EZpvd(CreateMpcResponse createMpcResponse, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C56390yDp.OLrzqt(createMpcResponse, list);
    }

    public static final InterfaceC60096zvd fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC60096zvd OLrzqt(Ref.ObjectRef objectRef, java.lang.String str, kotlin.Pair pair) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        java.util.Iterator it = ((java.util.List) second).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!((AbstractC12782ctV) next).DCUTEIdCUTEI()) {
                break;
            }
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) next;
        objectRef.element = str;
        if (abstractC12782ctV != null) {
            if (str.length() <= 0) {
                MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
                T t = "";
                if (mpcWalletEncodeInfoQSBOWP != null) {
                    java.lang.String mpcId = mpcWalletEncodeInfoQSBOWP.getMpcId();
                    t = "";
                    if (mpcId != null) {
                        t = mpcId;
                    }
                }
                objectRef.element = t;
            } else {
                MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
                if (Intrinsics.EZpvd((java.lang.Object) (mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getMpcId() : null), (java.lang.Object) str)) {
                    Intrinsics.copydefault(AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(pair.getFirst(), -1)));
                }
            }
        } else {
            objectRef.element = str;
        }
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(pair.getFirst(), objectRef.element));
    }

    public static final InterfaceC60096zvd fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static final InterfaceC60096zvd copydefault(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, java.lang.String str, java.lang.String str2, AbstractActivityC33041mov abstractActivityC33041mov, fFW ffw, java.lang.String str3, kotlin.Pair pair) {
        ?? r3;
        Ref.ObjectRef objectRef4;
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAEQbTJ;
        AbstractC58185ywX<java.lang.String> abstractC58185ywXEZpvd;
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String strCopydefault = C10964byQ.copydefault((java.lang.String) objectRef.element, xYQ.KWHzl.copydefault(4, null, ((CreateMpcResponse) pair.getFirst()).getData(), null, null, 3, null));
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        java.lang.String strEZpvd = C10964byQ.EZpvd(strCopydefault);
        if (strEZpvd == null) {
            objectRef4 = objectRef2;
            r3 = "";
        } else {
            r3 = strEZpvd;
            objectRef4 = objectRef2;
        }
        objectRef4.element = r3;
        MpcWalletDecodeInfo mpcWalletDecodeInfoOLrzqt = C10964byQ.OLrzqt(r3, (java.lang.String) objectRef3.element, str, str2, "", true);
        if (mpcWalletDecodeInfoOLrzqt != null) {
            MPCWalletShareBean mPCWalletShareBean = new MPCWalletShareBean(mpcWalletDecodeInfoOLrzqt.getEd25519Share3(), mpcWalletDecodeInfoOLrzqt.getEcdsaShare3(), mpcWalletDecodeInfoOLrzqt.getEcdsaP3());
            InterfaceC14373dkI interfaceC14373dkIEZpvd = C14392dkb.AEQbTJ.EZpvd(abstractActivityC33041mov, ffw.AEQbTJ);
            if (interfaceC14373dkIEZpvd != null && (abstractC58260yxtAEQbTJ = interfaceC14373dkIEZpvd.AEQbTJ(mPCWalletShareBean, (java.lang.String) objectRef3.element, str, str2, str3)) != null && (abstractC58185ywXEZpvd = abstractC58260yxtAEQbTJ.EZpvd()) != null) {
                return abstractC58185ywXEZpvd;
            }
            AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.Exception("data error"));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.Exception("data error"));
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ2);
        return abstractC58185ywXAEQbTJ2;
    }

    public static final InterfaceC60096zvd getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC60096zvd KWHzl(Ref.ObjectRef objectRef, java.lang.String str, fFW ffw, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return C43423rox.OLrzqt(ffw.copydefault.copydefault(new SyncShareRequestBody((java.lang.String) objectRef.element, str, 3, 2, 2, (java.lang.String) null, ffw.AEQbTJ, 32, (DefaultConstructorMarker) null)), new Function1() { // from class: o.fGv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(fFW.gEmmrt((ResponseData) obj));
            }
        });
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gJn.importMpcWallet$default(o.gJn, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, androidx.fragment.app.FragmentManager, java.lang.String, kotlin.jvm.functions.Function1, int, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, int i, final fFW ffw, final Function1 function1, SyncShareResponse syncShareResponse) {
        ((C19631gJn) new ViewModelProvider(abstractActivityC33041mov).get(C19631gJn.class)).copydefault(str, (java.lang.String) objectRef.element, (java.lang.String) objectRef2.element, (java.lang.String) objectRef3.element, MpcWalletCreateType.ICLOUD_RECOVER.getValue(), null, (64 & 64) != 0 ? "" : null, new Function1() { // from class: o.fGs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fFW.AEQbTJ(this.EZpvd, function1, (AbstractC12782ctV) obj);
            }
        }, (64 & 256) != 0 ? 3 : i);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(fFW ffw, final Function1 function1, final AbstractC12782ctV abstractC12782ctV) {
        ffw.OLrzqt.OLrzqt(new Function0() { // from class: o.fGH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fFW.EZpvd(function1, abstractC12782ctV);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        function1.invoke(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final void hDKMBd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final fFW ffw, final AbstractActivityC33041mov abstractActivityC33041mov, final int i, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final Function1 function1, java.lang.Throwable th) {
        C43296rmc.AEQbTJ("restoreFromCloud", "error " + th.getMessage());
        if (ffw.OLrzqt.isAdded()) {
            ffw.AEQbTJ(abstractActivityC33041mov, i, str, str2, str3, str4, str5, (Function1<? super AbstractC12782ctV, Unit>) function1);
        } else {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: o.fGi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    fFW.KWHzl(this.KWHzl, abstractActivityC33041mov, i, str, str2, str3, str4, str5, function1);
                }
            });
        }
        int i2 = ffw.AEQbTJ;
        if (i2 == 1) {
            C11572cTf c11572cTf = C11572cTf.copydefault;
            java.lang.String message = th.getMessage();
            C55326xho.toast$default(c11572cTf.EZpvd(message != null ? message : ""), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else if (i2 == 2) {
            C11580cTn c11580cTn = C11580cTn.EZpvd;
            java.lang.String message2 = th.getMessage();
            C55326xho.toast$default(c11580cTn.KWHzl(message2 != null ? message2 : ""), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(fFW ffw, AbstractActivityC33041mov abstractActivityC33041mov, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, Function1 function1) {
        ffw.AEQbTJ(abstractActivityC33041mov, i, str, str2, str3, str4, str5, (Function1<? super AbstractC12782ctV, Unit>) function1);
    }

    public final void AEQbTJ(final AbstractActivityC33041mov abstractActivityC33041mov, final int i, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final Function1<? super AbstractC12782ctV, Unit> function1) {
        this.OLrzqt.AkhnZx();
        C15724eSy.AEQbTJ.copydefault(abstractActivityC33041mov, new Function0() { // from class: o.fGx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fFW.EZpvd(this.KWHzl, abstractActivityC33041mov, i, str, str2, str3, str4, str5, function1);
            }
        }, new yHO() { // from class: o.fGw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return fFW.EZpvd(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
            }
        });
    }

    public static final Unit EZpvd(fFW ffw, AbstractActivityC33041mov abstractActivityC33041mov, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, Function1 function1) {
        ffw.EZpvd(abstractActivityC33041mov, i, str, str2, str3, str4, str5, function1);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(fFW ffw, int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        if (i == 1) {
            ffw.OLrzqt.fetchVPNInfo();
        } else {
            ffw.OLrzqt.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<ResponseData<HandshakeResponse>> KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return C13934dbu.handshake$default(this.copydefault, 0, str4, str2, str3, str, null, 32, null);
    }

    public final AbstractC58185ywX<ResponseData<CheckShareResponse>> EZpvd(final java.lang.String str, final java.lang.String str2) throws JSONException {
        java.lang.String strCopydefault = copydefault(str2);
        if (strCopydefault.length() == 0) {
            final java.lang.String strValueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            C32866mlf.onEvent$default("mpc_wallet_generate_share_sign_empty", (TrackChannel[]) null, new Function1() { // from class: o.fFX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fFW.EZpvd(str, str2, strValueOf, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            AbstractC58185ywX<ResponseData<CheckShareResponse>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, "mpc_generate_share_sign share3 is empty", null, null, null, null, 45, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        JSONObject jSONObject = new JSONObject(strCopydefault);
        java.lang.String string = jSONObject.getString("message");
        java.lang.String string2 = jSONObject.getString("signature");
        C13934dbu c13934dbu = this.copydefault;
        Intrinsics.copydefault((java.lang.Object) string);
        Intrinsics.copydefault((java.lang.Object) string2);
        return c13934dbu.KWHzl(new CheckShareRequestBody(str, 1, string, string2));
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("mpcId", str, false));
        eventParamsList.add(new EventParam("share3Length", java.lang.String.valueOf(str2.length()), false));
        eventParamsList.add(new EventParam("timestamp", str3, false));
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<ResponseData<CreateMpcResponse>> AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i) {
        dZP dzp = dZP.OLrzqt;
        return this.copydefault.OLrzqt(2, str3, dzp.EZpvd(), dzp.AhwBna(), str, str2, str4, i);
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return xYQ.KWHzl.copydefault(str);
    }

    public final boolean OLrzqt(CheckShareResponse checkShareResponse) {
        return checkShareResponse.getShareStatus();
    }

    public static final boolean AEQbTJ(fFW ffw, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            if (ffw.OLrzqt((CheckShareResponse) data)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean djBIcL(ResponseData responseData) {
        HandshakeResponse handshakeResponse;
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData.getCode() == 0 && responseData.getData() != null && (handshakeResponse = (HandshakeResponse) responseData.getData()) != null && handshakeResponse.getPass();
    }

    public static final boolean AYXKKw(ResponseData responseData) {
        CreateMpcResponse createMpcResponse;
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData.getCode() == 0 && responseData.getData() != null && (createMpcResponse = (CreateMpcResponse) responseData.getData()) != null && createMpcResponse.getPass();
    }

    public static final boolean valueOf(ResponseData responseData) {
        CreateMpcResponse createMpcResponse;
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData.getCode() == 0 && responseData.getData() != null && (createMpcResponse = (CreateMpcResponse) responseData.getData()) != null && createMpcResponse.getPass();
    }

    public static final boolean AhwBna(ResponseData responseData) {
        CreateMpcResponse createMpcResponse;
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData.getCode() == 0 && responseData.getData() != null && (createMpcResponse = (CreateMpcResponse) responseData.getData()) != null && createMpcResponse.getPass();
    }

    public static final boolean gEmmrt(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData.getCode() == 0;
    }
}
