package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import java.io.Serializable;
import o.AbstractC5547Vx;
import o.C5616Yo;
import o.C5617Yp;
import o.InterfaceC5556Wg;
import o.InterfaceC5559Wj;
import o.InterfaceC5562Wm;
import o.VX;

/* JADX INFO: loaded from: classes21.dex */
public class DeserializerFactoryConfig implements Serializable {
    private static final long serialVersionUID = 1;
    protected final AbstractC5547Vx[] _abstractTypeResolvers;
    protected final InterfaceC5559Wj[] _additionalDeserializers;
    protected final InterfaceC5556Wg[] _additionalKeyDeserializers;
    protected final VX[] _modifiers;
    protected final InterfaceC5562Wm[] _valueInstantiators;
    protected static final InterfaceC5559Wj[] NO_DESERIALIZERS = new InterfaceC5559Wj[0];
    protected static final VX[] NO_MODIFIERS = new VX[0];
    protected static final AbstractC5547Vx[] NO_ABSTRACT_TYPE_RESOLVERS = new AbstractC5547Vx[0];
    protected static final InterfaceC5562Wm[] NO_VALUE_INSTANTIATORS = new InterfaceC5562Wm[0];
    protected static final InterfaceC5556Wg[] DEFAULT_KEY_DESERIALIZERS = {new StdKeyDeserializers()};

    public DeserializerFactoryConfig() {
        this(null, null, null, null, null);
    }

    public DeserializerFactoryConfig(InterfaceC5559Wj[] interfaceC5559WjArr, InterfaceC5556Wg[] interfaceC5556WgArr, VX[] vxArr, AbstractC5547Vx[] abstractC5547VxArr, InterfaceC5562Wm[] interfaceC5562WmArr) {
        this._additionalDeserializers = interfaceC5559WjArr == null ? NO_DESERIALIZERS : interfaceC5559WjArr;
        this._additionalKeyDeserializers = interfaceC5556WgArr == null ? DEFAULT_KEY_DESERIALIZERS : interfaceC5556WgArr;
        this._modifiers = vxArr == null ? NO_MODIFIERS : vxArr;
        this._abstractTypeResolvers = abstractC5547VxArr == null ? NO_ABSTRACT_TYPE_RESOLVERS : abstractC5547VxArr;
        this._valueInstantiators = interfaceC5562WmArr == null ? NO_VALUE_INSTANTIATORS : interfaceC5562WmArr;
    }

    public DeserializerFactoryConfig withAdditionalDeserializers(InterfaceC5559Wj interfaceC5559Wj) {
        if (interfaceC5559Wj == null) {
            throw new IllegalArgumentException("Cannot pass null Deserializers");
        }
        return new DeserializerFactoryConfig((InterfaceC5559Wj[]) C5617Yp.KWHzl(this._additionalDeserializers, interfaceC5559Wj), this._additionalKeyDeserializers, this._modifiers, this._abstractTypeResolvers, this._valueInstantiators);
    }

    public DeserializerFactoryConfig withAdditionalKeyDeserializers(InterfaceC5556Wg interfaceC5556Wg) {
        if (interfaceC5556Wg == null) {
            throw new IllegalArgumentException("Cannot pass null KeyDeserializers");
        }
        return new DeserializerFactoryConfig(this._additionalDeserializers, (InterfaceC5556Wg[]) C5617Yp.KWHzl(this._additionalKeyDeserializers, interfaceC5556Wg), this._modifiers, this._abstractTypeResolvers, this._valueInstantiators);
    }

    public DeserializerFactoryConfig withDeserializerModifier(VX vx) {
        if (vx == null) {
            throw new IllegalArgumentException("Cannot pass null modifier");
        }
        return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, (VX[]) C5617Yp.KWHzl(this._modifiers, vx), this._abstractTypeResolvers, this._valueInstantiators);
    }

    public DeserializerFactoryConfig withAbstractTypeResolver(AbstractC5547Vx abstractC5547Vx) {
        if (abstractC5547Vx == null) {
            throw new IllegalArgumentException("Cannot pass null resolver");
        }
        return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, this._modifiers, (AbstractC5547Vx[]) C5617Yp.KWHzl(this._abstractTypeResolvers, abstractC5547Vx), this._valueInstantiators);
    }

    public DeserializerFactoryConfig withValueInstantiators(InterfaceC5562Wm interfaceC5562Wm) {
        if (interfaceC5562Wm == null) {
            throw new IllegalArgumentException("Cannot pass null resolver");
        }
        return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, this._modifiers, this._abstractTypeResolvers, (InterfaceC5562Wm[]) C5617Yp.KWHzl(this._valueInstantiators, interfaceC5562Wm));
    }

    public boolean hasDeserializers() {
        return this._additionalDeserializers.length > 0;
    }

    public boolean hasKeyDeserializers() {
        return this._additionalKeyDeserializers.length > 0;
    }

    public boolean hasDeserializerModifiers() {
        return this._modifiers.length > 0;
    }

    public boolean hasAbstractTypeResolvers() {
        return this._abstractTypeResolvers.length > 0;
    }

    public boolean hasValueInstantiators() {
        return this._valueInstantiators.length > 0;
    }

    public Iterable<InterfaceC5559Wj> deserializers() {
        return new C5616Yo(this._additionalDeserializers);
    }

    public Iterable<InterfaceC5556Wg> keyDeserializers() {
        return new C5616Yo(this._additionalKeyDeserializers);
    }

    public Iterable<VX> deserializerModifiers() {
        return new C5616Yo(this._modifiers);
    }

    public Iterable<AbstractC5547Vx> abstractTypeResolvers() {
        return new C5616Yo(this._abstractTypeResolvers);
    }

    public Iterable<InterfaceC5562Wm> valueInstantiators() {
        return new C5616Yo(this._valueInstantiators);
    }
}
