package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import o.AbstractC56570yKg;
import o.AbstractC56919yXe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yKi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56572yKi {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yKi.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC56572yKi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String KWHzl();

    private AbstractC56572yKi() {
    }

    /* JADX INFO: renamed from: o.yKi$TaskDescription */
    public static final class TaskDescription extends AbstractC56572yKi {
        public final JvmProtoBuf.JvmPropertySignature AEQbTJ;
        public final yWS EZpvd;
        public final InterfaceC56676yOe KWHzl;
        public final java.lang.String OLrzqt;
        public final ProtoBuf.Property copydefault;
        public final yWW valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ProtoBuf.Property AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JvmProtoBuf.JvmPropertySignature AYXKKw() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final yWW AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final yWS EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC56572yKi
        public java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC56676yOe copydefault() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull InterfaceC56676yOe interfaceC56676yOe, @NotNull ProtoBuf.Property property, @NotNull JvmProtoBuf.JvmPropertySignature jvmPropertySignature, @NotNull yWS yws, @NotNull yWW yww) {
            java.lang.String str;
            super(null);
            Intrinsics.checkNotNullParameter(interfaceC56676yOe, "");
            Intrinsics.checkNotNullParameter(property, "");
            Intrinsics.checkNotNullParameter(jvmPropertySignature, "");
            Intrinsics.checkNotNullParameter(yws, "");
            Intrinsics.checkNotNullParameter(yww, "");
            this.KWHzl = interfaceC56676yOe;
            this.copydefault = property;
            this.AEQbTJ = jvmPropertySignature;
            this.EZpvd = yws;
            this.valueOf = yww;
            if (jvmPropertySignature.hasGetter()) {
                str = yws.KWHzl(jvmPropertySignature.getGetter().getName()) + yws.KWHzl(jvmPropertySignature.getGetter().getDesc());
            } else {
                AbstractC56919yXe.Activity jvmFieldSignature$default = C56928yXn.getJvmFieldSignature$default(C56928yXn.AEQbTJ, property, yws, yww, false, 8, null);
                if (jvmFieldSignature$default != null) {
                    java.lang.String strEZpvd = jvmFieldSignature$default.EZpvd();
                    str = C56777yRy.copydefault(strEZpvd) + OLrzqt() + "()" + jvmFieldSignature$default.KWHzl();
                } else {
                    throw new KotlinReflectionInternalError("No field signature for property: " + interfaceC56676yOe);
                }
            }
            this.OLrzqt = str;
        }

        public final java.lang.String OLrzqt() {
            java.lang.String strKWHzl;
            InterfaceC56665yNu interfaceC56665yNuAuCTel = this.KWHzl.AuCTel();
            Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAuCTel, "");
            if (Intrinsics.EZpvd(this.KWHzl.getNewProxyInstance(), C56669yNy.KWHzl) && (interfaceC56665yNuAuCTel instanceof C59127zbF)) {
                ProtoBuf.Class classQKVWgx = ((C59127zbF) interfaceC56665yNuAuCTel).QKVWgx();
                GeneratedMessageLite.Activity<ProtoBuf.Class, java.lang.Integer> activity = JvmProtoBuf.copydefault;
                Intrinsics.checkNotNullExpressionValue(activity, "");
                java.lang.Integer num = (java.lang.Integer) yWY.KWHzl(classQKVWgx, activity);
                if (num == null || (strKWHzl = this.EZpvd.KWHzl(num.intValue())) == null) {
                    strKWHzl = "main";
                }
                return '$' + C56936yXv.copydefault(strKWHzl);
            }
            if (Intrinsics.EZpvd(this.KWHzl.getNewProxyInstance(), C56669yNy.AkhnZx) && (interfaceC56665yNuAuCTel instanceof yNW)) {
                InterfaceC56676yOe interfaceC56676yOe = this.KWHzl;
                Intrinsics.copydefault(interfaceC56676yOe, "");
                InterfaceC59145zbX interfaceC59145zbXOcIXYQ = ((C59218zcr) interfaceC56676yOe).OcIXYQ();
                if (interfaceC59145zbXOcIXYQ instanceof yVS) {
                    yVS yvs = (yVS) interfaceC59145zbXOcIXYQ;
                    if (yvs.AEQbTJ() != null) {
                        return '$' + yvs.djBIcL().AEQbTJ();
                    }
                }
            }
            return "";
        }
    }

    /* JADX INFO: renamed from: o.yKi$StateListAnimator */
    public static final class StateListAnimator extends AbstractC56572yKi {
        public final java.lang.reflect.Method EZpvd;
        public final java.lang.reflect.Method KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.reflect.Method AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.reflect.Method OLrzqt() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.reflect.Method method, java.lang.reflect.Method method2) {
            super(null);
            Intrinsics.checkNotNullParameter(method, "");
            this.EZpvd = method;
            this.KWHzl = method2;
        }

        @Override // o.AbstractC56572yKi
        public java.lang.String KWHzl() {
            return yLW.AEQbTJ(this.EZpvd);
        }
    }

    /* JADX INFO: renamed from: o.yKi$Activity */
    public static final class Activity extends AbstractC56572yKi {
        public final java.lang.reflect.Field AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.reflect.Field EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.reflect.Field field) {
            super(null);
            Intrinsics.checkNotNullParameter(field, "");
            this.AEQbTJ = field;
        }

        @Override // o.AbstractC56572yKi
        public java.lang.String KWHzl() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String name = this.AEQbTJ.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            sb.append(C56777yRy.copydefault(name));
            sb.append("()");
            java.lang.Class<?> type = this.AEQbTJ.getType();
            Intrinsics.checkNotNullExpressionValue(type, "");
            sb.append(C56743yQr.KWHzl(type));
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o.yKi$ActionBar */
    public static final class ActionBar extends AbstractC56572yKi {
        public final AbstractC56570yKg.StateListAnimator KWHzl;
        public final AbstractC56570yKg.StateListAnimator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC56570yKg.StateListAnimator EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC56570yKg.StateListAnimator OLrzqt() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull AbstractC56570yKg.StateListAnimator stateListAnimator, AbstractC56570yKg.StateListAnimator stateListAnimator2) {
            super(null);
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            this.copydefault = stateListAnimator;
            this.KWHzl = stateListAnimator2;
        }

        @Override // o.AbstractC56572yKi
        public java.lang.String KWHzl() {
            return this.copydefault.OLrzqt();
        }
    }
}
