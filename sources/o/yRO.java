package o;

import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yRO {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void AEQbTJ(int i) {
        java.lang.String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i == 18) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    public static <D extends CallableMemberDescriptor> java.util.Collection<D> OLrzqt(@NotNull C56935yXu c56935yXu, @NotNull java.util.Collection<D> collection, @NotNull java.util.Collection<D> collection2, @NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull InterfaceC59148zba interfaceC59148zba, @NotNull OverridingUtil overridingUtil) {
        if (c56935yXu == null) {
            AEQbTJ(0);
        }
        if (collection == null) {
            AEQbTJ(1);
        }
        if (collection2 == null) {
            AEQbTJ(2);
        }
        if (interfaceC56658yNn == null) {
            AEQbTJ(3);
        }
        if (interfaceC59148zba == null) {
            AEQbTJ(4);
        }
        if (overridingUtil == null) {
            AEQbTJ(5);
        }
        return AEQbTJ(c56935yXu, collection, collection2, interfaceC56658yNn, interfaceC59148zba, overridingUtil, false);
    }

    public static <D extends CallableMemberDescriptor> java.util.Collection<D> EZpvd(@NotNull C56935yXu c56935yXu, @NotNull java.util.Collection<D> collection, @NotNull java.util.Collection<D> collection2, @NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull InterfaceC59148zba interfaceC59148zba, @NotNull OverridingUtil overridingUtil) {
        if (c56935yXu == null) {
            AEQbTJ(6);
        }
        if (collection == null) {
            AEQbTJ(7);
        }
        if (collection2 == null) {
            AEQbTJ(8);
        }
        if (interfaceC56658yNn == null) {
            AEQbTJ(9);
        }
        if (interfaceC59148zba == null) {
            AEQbTJ(10);
        }
        if (overridingUtil == null) {
            AEQbTJ(11);
        }
        return AEQbTJ(c56935yXu, collection, collection2, interfaceC56658yNn, interfaceC59148zba, overridingUtil, true);
    }

    public static <D extends CallableMemberDescriptor> java.util.Collection<D> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull java.util.Collection<D> collection, @NotNull java.util.Collection<D> collection2, @NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull final InterfaceC59148zba interfaceC59148zba, @NotNull OverridingUtil overridingUtil, final boolean z) {
        if (c56935yXu == null) {
            AEQbTJ(12);
        }
        if (collection == null) {
            AEQbTJ(13);
        }
        if (collection2 == null) {
            AEQbTJ(14);
        }
        if (interfaceC56658yNn == null) {
            AEQbTJ(15);
        }
        if (interfaceC59148zba == null) {
            AEQbTJ(16);
        }
        if (overridingUtil == null) {
            AEQbTJ(17);
        }
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        overridingUtil.OLrzqt(c56935yXu, collection, collection2, interfaceC56658yNn, new yYG() { // from class: o.yRO.4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static /* synthetic */ void KWHzl(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i == 2) {
                    objArr[0] = "fromCurrent";
                } else if (i == 3) {
                    objArr[0] = "member";
                } else if (i != 4) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "overridden";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else if (i == 3 || i == 4) {
                    objArr[2] = "setOverriddenDescriptors";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yYG
            public void OLrzqt(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
                if (callableMemberDescriptor == null) {
                    KWHzl(1);
                }
                if (callableMemberDescriptor2 == null) {
                    KWHzl(2);
                }
            }

            @Override // o.yYO
            public void KWHzl(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    KWHzl(0);
                }
                OverridingUtil.AEQbTJ(callableMemberDescriptor, new Function1<CallableMemberDescriptor, Unit>() { // from class: o.yRO.4.4
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    private static /* synthetic */ void OLrzqt(int i) {
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public Unit invoke(@NotNull CallableMemberDescriptor callableMemberDescriptor2) {
                        if (callableMemberDescriptor2 == null) {
                            OLrzqt(0);
                        }
                        interfaceC59148zba.AEQbTJ(callableMemberDescriptor2);
                        return Unit.INSTANCE;
                    }
                });
                linkedHashSet.add(callableMemberDescriptor);
            }

            @Override // o.yYO
            public void AEQbTJ(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull java.util.Collection<? extends CallableMemberDescriptor> collection3) {
                if (callableMemberDescriptor == null) {
                    KWHzl(3);
                }
                if (collection3 == null) {
                    KWHzl(4);
                }
                if (!z || callableMemberDescriptor.bW_() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                    super.AEQbTJ(callableMemberDescriptor, collection3);
                }
            }
        });
        return linkedHashSet;
    }

    public static InterfaceC56695yOx KWHzl(@NotNull C56935yXu c56935yXu, @NotNull InterfaceC56658yNn interfaceC56658yNn) {
        if (c56935yXu == null) {
            AEQbTJ(19);
        }
        if (interfaceC56658yNn == null) {
            AEQbTJ(20);
        }
        java.util.Collection<InterfaceC56656yNl> collectionDjBIcL = interfaceC56658yNn.djBIcL();
        if (collectionDjBIcL.size() != 1) {
            return null;
        }
        for (InterfaceC56695yOx interfaceC56695yOx : collectionDjBIcL.iterator().next().fetchVPNInfo()) {
            if (interfaceC56695yOx.bR_().equals(c56935yXu)) {
                return interfaceC56695yOx;
            }
        }
        return null;
    }
}
