package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class BasicPolymorphicTypeValidator extends PolymorphicTypeValidator.Base implements Serializable {
    private static final long serialVersionUID = 1;
    protected final ActionBar[] _baseTypeMatchers;
    protected final Set<Class<?>> _invalidBaseTypes;
    protected final ActionBar[] _subClassMatchers;
    protected final TaskDescription[] _subTypeNameMatchers;

    public static abstract class ActionBar {
        public abstract boolean KWHzl(MapperConfig<?> mapperConfig, Class<?> cls);
    }

    public static class Activity {
    }

    public static abstract class TaskDescription {
        public abstract boolean copydefault(MapperConfig<?> mapperConfig, String str);
    }

    public BasicPolymorphicTypeValidator(Set<Class<?>> set, ActionBar[] actionBarArr, TaskDescription[] taskDescriptionArr, ActionBar[] actionBarArr2) {
        this._invalidBaseTypes = set;
        this._baseTypeMatchers = actionBarArr;
        this._subTypeNameMatchers = taskDescriptionArr;
        this._subClassMatchers = actionBarArr2;
    }

    public static Activity builder() {
        return new Activity();
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity validateBaseType(MapperConfig<?> mapperConfig, JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        Set<Class<?>> set = this._invalidBaseTypes;
        if (set != null && set.contains(rawClass)) {
            return PolymorphicTypeValidator.Validity.DENIED;
        }
        ActionBar[] actionBarArr = this._baseTypeMatchers;
        if (actionBarArr != null) {
            for (ActionBar actionBar : actionBarArr) {
                if (actionBar.KWHzl(mapperConfig, rawClass)) {
                    return PolymorphicTypeValidator.Validity.ALLOWED;
                }
            }
        }
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity validateSubClassName(MapperConfig<?> mapperConfig, JavaType javaType, String str) throws JsonMappingException {
        TaskDescription[] taskDescriptionArr = this._subTypeNameMatchers;
        if (taskDescriptionArr != null) {
            for (TaskDescription taskDescription : taskDescriptionArr) {
                if (taskDescription.copydefault(mapperConfig, str)) {
                    return PolymorphicTypeValidator.Validity.ALLOWED;
                }
            }
        }
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity validateSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) throws JsonMappingException {
        if (this._subClassMatchers != null) {
            Class<?> rawClass = javaType2.getRawClass();
            for (ActionBar actionBar : this._subClassMatchers) {
                if (actionBar.KWHzl(mapperConfig, rawClass)) {
                    return PolymorphicTypeValidator.Validity.ALLOWED;
                }
            }
        }
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }
}
