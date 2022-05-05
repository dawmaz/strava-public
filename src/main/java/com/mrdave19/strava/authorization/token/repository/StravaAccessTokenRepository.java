package com.mrdave19.strava.authorization.token.repository;

import com.mrdave19.strava.authorization.token.entity.StravaAccessToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StravaAccessTokenRepository extends JpaRepository<StravaAccessToken,Long> {
}
