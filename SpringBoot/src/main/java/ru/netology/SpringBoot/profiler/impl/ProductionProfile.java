package ru.netology.SpringBoot.profiler.impl;

import ru.netology.SpringBoot.profiler.SystemProfile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
